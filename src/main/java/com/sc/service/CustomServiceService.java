package com.sc.service;

import com.sc.dao.CustomServiceDao;
import com.sc.domain.costomservice.BrandidAndBrand;
import com.sc.domain.costomservice.SelleridAndNameAndAccount;
import com.sc.domain.generator.*;
import com.sc.storage.StorageService;
import com.sc.utils.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * CustomServiceService
 * Created by valora on 2017/5/12.
 */
@Service
public class CustomServiceService {

    @Value("${root}")
    private String root;

    private final CustomServiceDao customServiceDao;
    private final JWT jwt;
    private final StorageService storageService;

    @Autowired
    public CustomServiceService(CustomServiceDao customServiceDao, JWT jwt, StorageService storageService) {
        this.customServiceDao = customServiceDao;
        this.jwt = jwt;
        this.storageService = storageService;
    }

    /**
     * 删除商品详情
     *
     * @param adminId        管理员id
     * @param goodsdetailsid 商品详情id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result delGoodsDetailsS(String adminId, Integer goodsdetailsid) {
        try {
            String str = jwt.createJWT(adminId);
            int i = customServiceDao.delGoodsDetailsD(goodsdetailsid);
            if (i > 0) {
                return GetResult.toJson(0, null, str, null, 0);
            }
            return GetResult.toJson(200, null, str, null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除商品展示图（单张）
     *
     * @param adminId 管理员id
     * @param goodsid 商品id
     * @param delnum  图片序号
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result delGoodsShowImg(String adminId, String goodsid, Integer delnum) {
        try {
            String str = jwt.createJWT(adminId);
            GoodsWithBLOBs goodsWithBLOBs = null;
            List<Goods> list = customServiceDao.selectGoodsByGoodsid(goodsid);
            if (list != null && list.size() > 0) {
                //list中放的是父类，有些属性只有子类才有，需要对list中的对象塑性
                goodsWithBLOBs = (GoodsWithBLOBs) list.get(0);
                String[] str1 = goodsWithBLOBs.getCmFigurespath().split("|");
                //删除图片
                storageService.deleteByFigurePath(str1[delnum]);
                str1[delnum] = "";
                String str2 = String.join("|", str1).replace("||", "|");
                goodsWithBLOBs.setCmFigurespath(str2);
                int i = customServiceDao.updateGoods(goodsWithBLOBs);
            }
            return GetResult.toJson(0, null, str, null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 搜索厂家(由于厂家较多，所以使用厂家名模糊查询)
     *
     * @param content 输入的搜索的内容
     * @return result
     */
    public Result selectSellerByLike(String content) {
        try {
            List<Sellers> list = customServiceDao.selectSellerByLikeD(content);
            //返回的对象只需要三个字段，需要重新见一个实体对象
            List<SelleridAndNameAndAccount> list1 = sellertToSelleridAndNameAndAccount(list);
            return GetResult.toJson(0, null, null, list1, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询所有sellers
     *
     * @return result
     */
    public Result queryAllSellers() {
        try {
            List<Sellers> list = customServiceDao.queryAllSellersD();
            //返回的对象只需要三个字段，需要重新见一个实体对象
            List<SelleridAndNameAndAccount> list1 = sellertToSelleridAndNameAndAccount(list);
            return GetResult.toJson(0, null, null, list1, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }


    /**
     * 模糊查询品牌
     *
     * @param content 搜索内容
     * @return result
     */
    public Result searchBrandsByLike(String content) {
        try {
            List<Brands> list = customServiceDao.searchBrandsByLikeD(content);
            List<BrandidAndBrand> list1 = brandsToBrandidAndBrand(list);
            return GetResult.toJson(0, null, null, list1, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询所有品牌
     *
     * @return result
     */
    public Result queryAllBrands() {
        try {
            List<Brands> list = customServiceDao.queryAllBrandsD();
            System.out.println(list.size());
            List<BrandidAndBrand> list1 = brandsToBrandidAndBrand(list);
            return GetResult.toJson(0, null, null, list1, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 将sellers集合转换成SelleridAndNameAndAccount集合
     *
     * @param list sellers集合
     * @return SelleridAndNameAndAccount集合
     */
    private List<SelleridAndNameAndAccount> sellertToSelleridAndNameAndAccount(List<Sellers> list) {
        List<SelleridAndNameAndAccount> list1 = new ArrayList<>();
        if (list != null && list.size() > 0) {
            //只有当list不为空的时候才对list1进行赋值，不然就是搜索的厂家名不存在
            for (Sellers sellers : list) {
                SelleridAndNameAndAccount selectSellerByLikeContent = new SelleridAndNameAndAccount();
                selectSellerByLikeContent.setCmSellerid(sellers.getCmSellerid());
                selectSellerByLikeContent.setCmSellername(sellers.getCmSellername());
                selectSellerByLikeContent.setCmAccount(sellers.getCmAccount());
                list1.add(selectSellerByLikeContent);
            }
        }
        return list1;
    }

    /**
     * 将brands集合转换成BrandidAndBrand集合
     *
     * @param list brands集合
     * @return BrandidAndBrand集合
     */
    private List<BrandidAndBrand> brandsToBrandidAndBrand(List<Brands> list) {
        List<BrandidAndBrand> list1 = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (Brands brands : list) {
                BrandidAndBrand brandidAndBrand = new BrandidAndBrand();
                brandidAndBrand.setCmBrand(brands.getCmBrand());
                brandidAndBrand.setCmBrandid(brands.getCmBrandid());
                list1.add(brandidAndBrand);
            }
        }
        return list1;
    }

    /**
     * 上传商品
     *
     * @param userId
     * @param goodsartnum
     * @param sellerid
     * @param classifyid
     * @param classifytabs
     * @param brandid
     * @param title
     * @param originalprice
     * @param presentprice
     * @param html
     * @param chtml
     * @param ispromotion
     * @param spec
     * @param stock
     * @param colorarr
     * @param files
     * @param goodsid
     * @return
     */
    public Result uploadGoods(String userId, String goodsartnum, String sellerid, int classifyid, String classifytabs, int brandid, String title, double originalprice, double presentprice, String html, String chtml, int ispromotion, String spec, int stock, String[] colorarr, List<MultipartFile> files, String goodsid) {
        try {
            Admins admin = customServiceDao.selectAdminInfo(userId);
            if (admin == null || (admin.getCmLevel() != 1 && admin.getCmLevel() != 3)) {
                return GetResult.toJson(45, null, null, null, 0);
            }
            Date time = new Date();
            if (StringUtils.isBlank(goodsid)) {
                goodsid = DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(4);
            }
            String mainpath = "";
            String showpath = "";
            File file = new File(root);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            String spec_stock = "";
            String[] specArr = spec.split("|");
            for (String spec1 : specArr) {
                spec_stock = spec1 + "_" + stock + "|";
            }
            int i = 0;
            for (MultipartFile file1 : files) {
                String res = "";
                String newfilename = i + "." + storageService.getFileType(file1.getOriginalFilename());
                if (storageService.store(file1, newfilename)) {
                    res = root + newfilename;
                }
                if (file1.getName() == "main") {
                    mainpath = res;
                } else if (file1.getName() == "show") {
                    showpath += res + "|";
                } else {
                    GooddetailsWithBLOBs details = new GooddetailsWithBLOBs();
                    details.setCmGoodsid(goodsid);
                    details.setCmImagepath(res);
                    details.setCmColor(colorarr[i]);
                    details.setCmSpecStock(spec_stock);
                    customServiceDao.insertGoodDetails(details);
                    i++;
                }
            }

            GoodsWithBLOBs goods = new GoodsWithBLOBs();
            goods.setCmGoodsid(goodsid);
            goods.setCmGoodsartnum(goodsartnum);
            goods.setCmSellerid(sellerid);
            goods.setCmClassifyid(classifyid);
            goods.setCmClassifytabs(classifytabs);
            goods.setCmBrandid(brandid);
            goods.setCmTitle(title);
            goods.setCmChtml(chtml);
            goods.setCmSales(0);
            goods.setCmOriginalprice(originalprice);
            goods.setCmPresentprice(presentprice);
            goods.setCmHtml(html);
            goods.setCmMainfigurepath(mainpath);
            goods.setCmFigurespath(showpath);
            goods.setCmCreatetime(time);
            goods.setCmIsoff(0);
            goods.setCmIspromotion(ispromotion);
            goods.setCmSpec(spec);

            customServiceDao.insertGoods(goods);

            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 修改商品
     *
     * @param adminid
     * @param goodsartnum
     * @param sellerid
     * @param classifyid
     * @param classifytabs
     * @param brandid
     * @param title
     * @param originalprice
     * @param presentprice
     * @param html
     * @param chtml
     * @param ispromotion
     * @param spec
     * @param stock
     * @param files
     * @param goodsid
     * @param changetab
     * @return
     */
    public Result reviseGoodsS(String adminid, String goodsartnum, String sellerid, int classifyid, String classifytabs, int brandid, String title, double originalprice, double presentprice, String html, String chtml, int ispromotion, String spec, int stock, List<MultipartFile> files, String goodsid, String changetab) {
        try {
            Admins admins = customServiceDao.selectAdminInfo(adminid);
            if (admins == null || (admins.getCmLevel() != 1 && admins.getCmLevel() != 3)) {
                return GetResult.toJson(45, null, null, null, 0);
            }
            GoodsWithBLOBs goods = null;
            List list = customServiceDao.selectGoodsByGoodsid(goodsid);
            if (list != null && list.size() > 0) {
                goods = (GoodsWithBLOBs) list.get(0);
            }
            if (goods == null) {
                return GetResult.toJson(17, null, jwt.createJWT(adminid), null, 0);
            }
            String spec_stock = "";
            String[] specArr = spec.split("|");
            for (String spec1 : specArr) {
                spec_stock = spec1 + "_" + stock + "|";
            }
            List<GooddetailsWithBLOBs> gooddetailsList = customServiceDao.selectGooddetailBygoodid(goodsid);
            for (GooddetailsWithBLOBs gooddetails : gooddetailsList) {
                gooddetails.setCmSpecStock(spec_stock);
            }
            int a = files.size();
            String mainpath = "";
            String showpath = "";
            if (a > 0) {
                String[] carr = changetab.split("|");
                List<String> iarr = Arrays.asList(goods.getCmFigurespath().split("|"));
                File file = new File(root);
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
                int i = 0;
                for (MultipartFile file1 : files) {
                    String res = "";
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmssSSSS");
                    String str = simpleDateFormat.format(date);
                    String newfilename = str + "." + storageService.getFileType(file1.getOriginalFilename());
                    if (storageService.store(file1, newfilename)) {
                        res = root + newfilename;
                    }
                    if (file1.getName() == "main") {
                        mainpath = res;
                    } else {
                        storageService.deleteByFigurePath(iarr.get(i));
                        if (i > (iarr.size() - 1)) {
                            iarr.add(res);
                        } else {
                            iarr.set(i, res);
                        }
                        i++;
                    }
                }
                showpath = String.join("|", iarr);
            }
            goods.setCmGoodsartnum(goodsartnum);
            goods.setCmSellerid(sellerid);
            goods.setCmClassifyid(classifyid);
            goods.setCmClassifytabs(classifytabs);
            goods.setCmBrandid(brandid);
            goods.setCmTitle(title);
            goods.setCmChtml(chtml);
            goods.setCmSales(0);
            goods.setCmOriginalprice(originalprice);
            goods.setCmPresentprice(presentprice);
            goods.setCmHtml(html);
            goods.setCmIspromotion(ispromotion);
            goods.setCmSpec(spec);
            if (!mainpath.equals("")) {
                goods.setCmMainfigurepath(mainpath);
            }
            if (!showpath.equals("")) {
                goods.setCmFigurespath(showpath);
            }
            customServiceDao.updateGoods(goods);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 修改商品颜色
     *
     * @param adminid
     * @param goodsdetailsid
     * @param color
     * @param stock
     * @param files
     * @return
     */
    public Result reviseGoodsDetailsS(String adminid, String goodsdetailsid, String color, String stock, List<MultipartFile> files) {
        try {
            GooddetailsWithBLOBs gooddetailsWithBLOBs = customServiceDao.selectGooddetailBygooddetailsid(goodsdetailsid);
            if (gooddetailsWithBLOBs == null) {
                return GetResult.toJson(53, null, jwt.createJWT(adminid), null, 0);
            }
            if (files.size() > 0) {
                String res = "";
                storageService.deleteByFigurePath(gooddetailsWithBLOBs.getCmImagepath());
                File file = new File(root);
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmssSSSS");
                String str = simpleDateFormat.format(date);
                String newfilename = str + "." + storageService.getFileType(files.get(0).getOriginalFilename());
                if (storageService.store(files.get(0), newfilename)) {
                    res = root + newfilename;
                }
                gooddetailsWithBLOBs.setCmImagepath(res);
            }
            int stock1 = Integer.valueOf(stock);
            if (stock1 > 0) {
                String spec_stock = "";
                Goods goods = customServiceDao.selectGoodsByGoodsid(gooddetailsWithBLOBs.getCmGoodsid()).get(0);
                String spec = goods.getCmSpec();
                String[] specArr = spec.split("|");
                for (String spec1 : specArr) {
                    spec_stock = spec1 + "_" + stock + "|";
                }
                gooddetailsWithBLOBs.setCmSpecStock(spec_stock);
            }
            gooddetailsWithBLOBs.setCmColor(color);
            customServiceDao.updateGooddetails(gooddetailsWithBLOBs);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 添加商品详情
     *
     * @param adminid
     * @param goodsid
     * @param color
     * @param stock
     * @param multipartFile
     * @return
     */
    public Result addGoodsDetailsS(String adminid, String goodsid, String color, String stock, MultipartFile multipartFile) {
        try {
            GoodsWithBLOBs goods = null;
            List<Goods> list = customServiceDao.selectGoodsByGoodsid(goodsid);
            if (list != null && list.size() > 0) {
                goods = (GoodsWithBLOBs) list.get(0);
            }
            if (goods == null) {
                return GetResult.toJson(53, null, jwt.createJWT(adminid), null, 0);
            }
            File file = new File(root);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmssSSSS");
            String str = simpleDateFormat.format(date);
            String newfilename = str + "." + storageService.getFileType(multipartFile.getOriginalFilename());
            String res = "";
            if (storageService.store(multipartFile, newfilename)) {
                res = root + newfilename;
            }
            String spec_stock = "";
            String spec = goods.getCmSpec();
            String[] specArr = spec.split("|");
            for (String spec1 : specArr) {
                spec_stock = spec1 + "_" + stock + "|";
            }
            GooddetailsWithBLOBs gooddetailsWithBLOBs = new GooddetailsWithBLOBs();
            gooddetailsWithBLOBs.setCmColor(color);
            gooddetailsWithBLOBs.setCmGoodsid(goodsid);
            gooddetailsWithBLOBs.setCmSpecStock(spec_stock);
            gooddetailsWithBLOBs.setCmImagepath(res);
            customServiceDao.insertGoodDetails(gooddetailsWithBLOBs);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
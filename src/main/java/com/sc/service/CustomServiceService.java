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

    @Value("${goodsfiles}")
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
    public Result delGoodsShowImg(String adminId, String goodsid, Integer delnum/**/) {
        try {
            String str = jwt.createJWT(adminId);
            GoodsWithBLOBs goods = customServiceDao.selectGoodsByGoodsid(goodsid);
            String[] str1 = goods.getCM_FIGURESPATH().split("\\|");
            //删除图片
            storageService.deleteByFigurePath(str1[delnum]);
            str1[delnum] = "";
            String str2 = String.join("|", str1).replace("||", "|");
            goods.setCM_FIGURESPATH(str2);
            int i = customServiceDao.updateGoods(goods);
            return GetResult.toJson(0, null, str, null, 0);
        } catch (Exception e)
        {
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
                selectSellerByLikeContent.setCM_SELLERID(sellers.getCM_SELLERID());
                selectSellerByLikeContent.setCM_SELLERNAME(sellers.getCM_SELLERNAME());
                selectSellerByLikeContent.setCM_ACCOUNT(sellers.getCM_ACCOUNT());
                selectSellerByLikeContent.setCM_PHONE(String.valueOf(sellers.getCM_PHONE()));
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
                brandidAndBrand.setCM_BRAND(brands.getCM_BRAND());
                brandidAndBrand.setCM_BRANDID(brands.getCM_BRANDID());
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
     * @param colorarr
     * @param goodsid
     * @return
     */
    public Result uploadGoods(String userId, String goodsartnum, String sellerid, int classifyid, String classifytabs, int brandid, String title, double originalprice, double presentprice, String html, String chtml, int ispromotion, String spec, String[] colorarr, String[] stockarr, String goodsid, MultipartFile[] mainFiles, MultipartFile[] showFiles, MultipartFile[] colorFiles) {
        try {
            Admins admin = customServiceDao.selectAdminInfo(userId);
            if (admin == null || (admin.getCM_LEVEL() != 1 && admin.getCM_LEVEL() != 3)) {
                return GetResult.toJson(45, null, null, null, 0);
            }
            Date time = new Date();
            if (StringUtils.isBlank(goodsid)) {
                goodsid = DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(4);
            }
            if (colorarr.length != stockarr.length) {
                return GetResult.toJson(65, null, null, null, 0);
            }
            String mainpath = "";
            String showpath = "";

            String[] specarr = spec.split("\\|");
            String spec_stock = "";
            ArrayList<String> spec_stocks = new ArrayList<>();
            //处理每个颜色的库存
            for (int i = 0; i < colorarr.length; i++) {
                spec_stock = "";
                for (int j = 0; j < specarr.length; j++) {
                    spec_stock += specarr[j] + "_" + stockarr[i] + "|";
                }
                spec_stocks.add(spec_stock);
            }
            int i = 0;
            //处理主图
            for (MultipartFile mainFile : mainFiles) {
                String fileName = mainFile.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String newfileName = root + goodsid + "\\main\\" + i + "." + storageService.getFileType(fileName);
                if (storageService.store(mainFile, newfileName)) {
                    mainpath += "C://Goodsfiles/" + goodsid + "/main/" + i + "." + storageService.getFileType(fileName);
                }
                i = ++i;
            }
            int j = 0;
            //处理展示图
            for (MultipartFile showFile : showFiles) {
                String fileName = showFile.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String newfileName = root + goodsid + "\\show\\" + j + "." + storageService.getFileType(fileName);
                if (storageService.store(showFile, newfileName)) {
                    showpath += "C://Goodsfiles/" + goodsid + "/show/" + j + "." + storageService.getFileType(fileName) + "|";
                }
                j = ++j;
            }
            int k = 0;
            //处理颜色图
            for (MultipartFile colorFile : colorFiles) {
                String colorpath = "C://Goodsfiles/";
                String fileName = colorFile.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String newfileName = root + goodsid + "\\color\\" + k + "." + storageService.getFileType(fileName);
                if (storageService.store(colorFile, newfileName)) {
                    colorpath += goodsid + "/color/" + k + "." + storageService.getFileType(fileName);
                }
                //插入商品详情表
                GooddetailsWithBLOBs gooddetails = new GooddetailsWithBLOBs();
                gooddetails.setCM_SPEC_STOCK(spec_stocks.get(k));
                gooddetails.setCM_COLOR(colorarr[k]);
                gooddetails.setCM_GOODSID(goodsid);
                gooddetails.setCM_IMAGEPATH(colorpath);
                customServiceDao.insertGoodDetails(gooddetails);
                k = ++k;
            }

            GoodsWithBLOBs goods = new GoodsWithBLOBs();
            goods.setCM_GOODSID(goodsid);
            goods.setCM_GOODSARTNUM(goodsartnum);
            goods.setCM_SELLERID(sellerid);
            goods.setCM_CLASSIFYID(classifyid);
            goods.setCM_CLASSIFYTABS(classifytabs);
            goods.setCM_BRANDID(brandid);
            goods.setCM_TITLE(title);
            goods.setCM_CHTML(chtml);
            goods.setCM_SALES(0);
            goods.setCM_ORIGINALPRICE(originalprice);
            goods.setCM_PRESENTPRICE(presentprice);
            goods.setCM_HTML(html);
            goods.setCM_MAINFIGUREPATH(mainpath);
            goods.setCM_FIGURESPATH(showpath);
            goods.setCM_CREATETIME(time);
            goods.setCM_ISOFF(0);
            goods.setCM_ISPROMOTION(ispromotion);
            goods.setCM_SPEC(spec);

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
     * @param goodsid
     * @param changetab
     * @param mainFile
     * @param showFiles
     * @param isoff
     * @return
     */
    public Result reviseGoodsS(String adminid, String goodsartnum, String sellerid, int classifyid, String classifytabs, int brandid, String title, double originalprice, double presentprice, String html, String chtml, int ispromotion, String spec, String goodsid, String changetab, MultipartFile mainFile, MultipartFile[] showFiles, String isoff) {
        try {
            Admins admins = customServiceDao.selectAdminInfo(adminid);
            if (admins == null || (admins.getCM_LEVEL() != 1 && admins.getCM_LEVEL() != 3)) {
                return GetResult.toJson(45, null, null, null, 0);
            }
            GoodsWithBLOBs good = customServiceDao.selectGoodsByGoodsid(goodsid);
            if (good.getCM_GOODSID() == null) {
                return GetResult.toJson(17, null, jwt.createJWT(adminid), null, 0);
            }
            String mainpath = "";
            String showpath = "";
            //新的展示图地址
            String newfigurepath = "";
            if (!mainFile.isEmpty()) {
                //处理主图
                int i = 0;
                String fileName = mainFile.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String newfileName = root + goodsid + "\\main\\" + i + "." + storageService.getFileType(fileName);
                if (storageService.store(mainFile, newfileName)) {
                    mainpath += "C://Goodsfiles/" + goodsid + "/main/" + i + "." + storageService.getFileType(fileName);
                }
            }

            if (showFiles.length > 0) {
                String[] changetabs = changetab.split("\\|");
                ArrayList<String> showpathorigin = new ArrayList<>(Arrays.asList(good.getCM_FIGURESPATH().split("\\|")));
                int j = 0;
                //处理展示图
                for (MultipartFile showFile : showFiles) {
                    //要删除的图片路径
                    int changeindex = Integer.valueOf(changetabs[j]);
                    String deletepath = showpathorigin.get(changeindex);
                    //删除图片
                    storageService.deleteByFigurePath(deletepath);
                    String fileName = showFile.getOriginalFilename();
                    if (!storageService.isImage(fileName)) {
                        return GetResult.toJson(28, null, null, null, 0);
                    }
                    String newfileindex = String.valueOf(changeindex + 1);
                    String newfileName = root + goodsid + "\\show\\" + newfileindex + "." + storageService.getFileType(fileName);
                    if (storageService.store(showFile, newfileName)) {
                        String newshowpath = "C://Goodsfiles/" + goodsid + "/show/" + newfileindex + "." + storageService.getFileType(fileName);
                        showpathorigin.set(changeindex, newshowpath);
                    }
                    j = ++j;
                }
                newfigurepath = StringUtil.join("|", showpathorigin);
            }

            GoodsWithBLOBs goods = new GoodsWithBLOBs();
            goods.setCM_GOODSID(goodsid);
            goods.setCM_GOODSARTNUM(goodsartnum);
            goods.setCM_SELLERID(sellerid);
            goods.setCM_CLASSIFYID(classifyid);
            goods.setCM_CLASSIFYTABS(classifytabs);
            goods.setCM_BRANDID(brandid);
            goods.setCM_TITLE(title);
            goods.setCM_CHTML(chtml);
            goods.setCM_SALES(0);
            goods.setCM_ORIGINALPRICE(originalprice);
            goods.setCM_PRESENTPRICE(presentprice);
            goods.setCM_HTML(html);
            goods.setCM_ISPROMOTION(ispromotion);
            goods.setCM_SPEC(spec);
            goods.setCM_ISOFF(Integer.valueOf(isoff));
            if (StringUtils.isNotEmpty(mainpath)) {
                goods.setCM_MAINFIGUREPATH(mainpath);
            }
            if (StringUtils.isNotEmpty(newfigurepath)) {
                goods.setCM_FIGURESPATH(newfigurepath);
            }
            customServiceDao.updateGoods(goods);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }


    /**
     * 修改商品详细
     *
     * @param adminid
     * @param goodsdetailsid
     * @param color
     * @param specs
     * @param stocks
     * @param colorFile
     * @return
     */
    public Result reviseGoodsDetailsS(String adminid, String goodsdetailsid, String color, String specs, String stocks, MultipartFile colorFile) {
        try {
            GooddetailsWithBLOBs gooddetail = customServiceDao.selectGooddetailBygooddetailsid(goodsdetailsid);
            if (gooddetail.getCM_GOODSID() == null) {
                return GetResult.toJson(53, null, jwt.createJWT(adminid), null, 0);
            }
            String[] specarr = specs.split("\\|");
            String[] stockarr = stocks.split("\\|");
            if (specarr.length != stockarr.length) {
                return GetResult.toJson(65, null, null, null, 0);
            }
            if (!colorFile.isEmpty()) {
                String res = "";
                String goodid = gooddetail.getCM_GOODSID();
                storageService.deleteByFigurePath(gooddetail.getCM_IMAGEPATH());
                String originPath = gooddetail.getCM_IMAGEPATH();
                String date = DateUtils.todayHhMmSs();
                String newfilename = root + goodid + "\\color\\" + date + "." + storageService.getFileType(colorFile.getOriginalFilename());
                if (storageService.store(colorFile, newfilename)) {
                    res = "C://Goodsfiles/" + goodid + "/color/" + date + "." + storageService.getFileType(colorFile.getOriginalFilename());
                }
                gooddetail.setCM_IMAGEPATH(res);
            }

            //修改每个颜色对应的库存详细
            int i = 0;
            String spec_stock = "";
            for (String spec : specarr) {
                spec_stock += spec + "_" + stockarr[i] + "|";
                i = ++i;
            }
            gooddetail.setCM_COLOR(color);
            if (StringUtils.isNotEmpty(spec_stock)) {
                gooddetail.setCM_SPEC_STOCK(spec_stock);
            }
            customServiceDao.updateGooddetails(gooddetail);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 增加商品详情
     *
     * @param adminid
     * @param goodsid
     * @param color
     * @param specs
     * @param stocks
     * @param colorFile
     * @return
     */
    public Result addGoodsDetailsS(String adminid, String goodsid, String color, String specs, String stocks, MultipartFile colorFile) {
        try {
            Goods goods = customServiceDao.selectGoodsByGoodsid(goodsid);
            if (goods.getCM_GOODSID() == null) {
                return GetResult.toJson(53, null, jwt.createJWT(adminid), null, 0);
            }
            String goodid = goods.getCM_GOODSID();
            String str = DateUtils.todayHhMmSs();
            String newfilename = root + goodid + "\\color\\" + str + "." + storageService.getFileType(colorFile.getOriginalFilename());
            String res = "";
            if (storageService.store(colorFile, newfilename)) {
                res = "C://Goodsfiles/" + goodid + "/color/" + str + "." + storageService.getFileType(colorFile.getOriginalFilename());
            }
            String spec_stock = "";
            String[] specArr = specs.split("\\|");
            String[] stockArr = stocks.split("\\|");
            if (specArr.length != stockArr.length) {
                return GetResult.toJson(65, null, null, null, 0);
            }
            //处理每个颜色对应的库存
            int i = 0;
            for (String spec : specArr) {
                spec_stock += spec + "_" + stockArr[i] + "|";
                i = ++i;
            }
            GooddetailsWithBLOBs gooddetailsWithBLOBs = new GooddetailsWithBLOBs();
            gooddetailsWithBLOBs.setCM_COLOR(color);
            gooddetailsWithBLOBs.setCM_GOODSID(goodsid);
            gooddetailsWithBLOBs.setCM_SPEC_STOCK(spec_stock);
            gooddetailsWithBLOBs.setCM_IMAGEPATH(res);
            customServiceDao.insertGoodDetails(gooddetailsWithBLOBs);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 上传商品HTML内容中的图片
     *
     * @param multipartFile 图片
     * @param goodsid       商品ID
     * @return
     */
    public Result uploadGoodsImg(MultipartFile multipartFile, String goodsid) {
        try {
            if (!storageService.isImage(multipartFile.getOriginalFilename())) {
                return GetResult.toJson(28, null, null, null, 0);
            }
            if (StringUtils.isEmpty(goodsid)) {
                goodsid = DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(4);
            }

            String filename = DateUtils.todayHhMmSs() + GetRandomNumber.genRandomNum(4) + "." + storageService.getFileType(multipartFile.getOriginalFilename());
            //主题路径
            String newfilename = root + goodsid + "\\" + filename;
            //缩略图路径
            String thfilename = root + goodsid + "\\th" + filename;
            if (storageService.storeAndCompress(multipartFile, newfilename, thfilename)) {
                return GetResult.toJson(0, null, null, "{'filepath':'" + "C://GoodsFiles/" + goodsid + "/" + filename + "', 'cfilepath':'" + "C://GoodsFiles/" + goodsid + "/th" + filename + "','goodsid':'" + goodsid + "'}", 0);
            } else {
                return GetResult.toJson(47, null, null, null, 0);
            }
        } catch (Exception ex) {
            return GetResult.toJson(47, null, null, null, 0);
        }
    }
}
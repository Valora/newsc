package com.sc.service;

import com.sc.dao.CustomServiceDao;
import com.sc.domain.CustomService.BrandidAndBrand;
import com.sc.domain.generator.Brands;
import com.sc.domain.generator.Goods;
import com.sc.domain.generator.GoodsWithBLOBs;
import com.sc.domain.generator.Sellers;
import com.sc.domain.CustomService.SelleridAndNameAndAccount;
import com.sc.storage.FileSystemStorageService;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * CustomServiceService
 * Created by valora on 2017/5/12.
 */
@Service
public class CustomServiceService {
    private final CustomServiceDao customServiceDao;
    private final JWT jwt;
    private final FileSystemStorageService fileSystemStorageService;

    @Autowired
    public CustomServiceService(CustomServiceDao customServiceDao, JWT jwt, FileSystemStorageService fileSystemStorageService) {
        this.customServiceDao = customServiceDao;
        this.jwt = jwt;
        this.fileSystemStorageService = fileSystemStorageService;
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
                //删除图片=======可能会有问题=========
                fileSystemStorageService.deleteByfigurepath(str1[delnum]);
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
            List<BrandidAndBrand> list1 = brandsToBrandidAndBrand(list);
            return GetResult.toJson(0, null, null, list1, 0);
        } catch (Exception e) {
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
        List<SelleridAndNameAndAccount> list1 = null;
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
        List<BrandidAndBrand> list1 = null;
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
}

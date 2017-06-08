package com.sc.domain.costomservice;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2017/6/8.
 */
@Data
public class ReviseGoods {
    private String token;
    //商品id
    private String goodsid;
    //商品码
    private String goodsartnum;
    //厂家id
    private String sellerid;
    //大类id
    private String classifyid;
    //子类id集合
    private String classifytabs;
    //品牌id
    private String brandid;
    //标题
    private String title;
    //原价
    private String originalprice;
    //现价
    private String presentprice;
    //html内容
    private String html;
    //html内容
    private String chtml;
    //是否推荐
    private String ispromotion;
    //规格
    private String spec;
    //库存
    private String stock;
    private String changetab;
    private List<MultipartFile> files;
}

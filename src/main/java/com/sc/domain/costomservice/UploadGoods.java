package com.sc.domain.costomservice;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by valora on 2017/6/7.
 */
@Data
public class UploadGoods {
    private String token;
    private String goodsid;
    private String goodsartnum;
    private String sellerid;
    private String classifyid;
    private String classifytabs;
    private String brandid;
    private String title;
    private String originalprice;
    private String presentprice;
    private String html;
    private String chtml;
    private String ispromotion;
    private String spec;
    private String stock;
    private String colors;
    private MultipartFile[] files;
}

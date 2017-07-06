package com.sc.domain.pagedata;

import lombok.Data;

import java.util.ArrayList;

/**
 * Created by valora on 2017/7/4.
 */
@Data
public class Subclass {
    private String CM_CLASSIFYNAME;
    private String CM_IMGPATH;
    private String CM_CLASSIFYID;
    private String CM_SORT;
    private ArrayList<ClassifyGoods> TB_GOODS;
}

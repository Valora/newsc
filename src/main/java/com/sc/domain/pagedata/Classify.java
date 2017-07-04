package com.sc.domain.pagedata;

import lombok.Data;

import java.util.ArrayList;

/**
 * Created by valora on 2017/7/4.
 */
@Data
public class Classify {
    private String cmClassifyname;
    private String cmImgpath;
    private String cmClassifyid;
    private String cmSort;
    private ArrayList<Subclass> tbSubclass;
}

package com.sc.domain.news;

import lombok.Data;

import java.sql.Blob;

@Data
public class News {
    private String id;
    private String title;
    private Blob content;
}

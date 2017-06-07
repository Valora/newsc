package com.sc.domain.sale;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by valora on 2017/6/7.
 */
@Data
public class UserApplication {
    private String token;
    private String address;
    private String pwd;
    private String pwdagain;
    private String cardno;
    private Long phone;
    private Integer code;
    private Double lon;
    private Double lat;
    private String shopname;
    private String personname;
    private String contactname;
    private String contactphone;
    private String telephone;
    private String pax;
    private List<MultipartFile> files;
}

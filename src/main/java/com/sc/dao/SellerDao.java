package com.sc.dao;

import com.sc.domain.SellerLogin;
import com.sc.mapper.SellerLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 厂家登录操作类
 * Created by valora on 2017/4/18.
 */
@Component
public class SellerDao {
    @Autowired
    private SellerLoginMapper sellerLoginMapper;
    
    public SellerLogin getSellerLoginInfo(String account, String password) {
        //厂家信息
        SellerLogin sellerLoginInfo = new SellerLogin();
        List<SellerLogin> result = sellerLoginMapper.selectLoginInfo(account, password);
        sellerLoginInfo.setCmCode(result.get(0).getCmCode());
        sellerLoginInfo.setCmPhone(result.get(0).getCmPhone());
        sellerLoginInfo.setCmSellerid(result.get(0).getCmSellerid());
        sellerLoginInfo.setCmSellerName(result.get(0).getCmSellerName());
        return sellerLoginInfo;
    }
}

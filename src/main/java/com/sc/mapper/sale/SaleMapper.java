package com.sc.mapper.sale;

import com.sc.domain.sale.SellersInfo;
import com.sc.domain.sale.UsersInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SaleMapper {

    List<UsersInfo> getUserInfoByAdminId(String userId);

    List<SellersInfo> getSellersInfoByAdminId(String userId);
}

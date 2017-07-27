package com.sc.mapper.sale;

import com.sc.domain.sale.SellersInfo;
import com.sc.domain.sale.UsersInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SaleMapper {

    List<UsersInfo> getUserInfoByAdminId(@Param("userId") String userId);

    List<SellersInfo> getSellersInfoByAdminId(@Param("userId") String userId);
}

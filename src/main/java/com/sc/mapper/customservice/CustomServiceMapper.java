package com.sc.mapper.customservice;

import com.sc.domain.generator.GooddetailsWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomServiceMapper {
    void addGoodDetails(GooddetailsWithBLOBs details);
}

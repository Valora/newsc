package com.sc.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 结果类
 * Created by valora on 2017/4/27.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    public int errorCode;
    public String errorMsg;
    public String token;
    public Object result;
    public int pageNum;
}

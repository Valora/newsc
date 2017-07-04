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
    public int ErrorCode;
    public String ErrorMsg;
    public String Token;
    public Object Result;
    public int PageNum;
}

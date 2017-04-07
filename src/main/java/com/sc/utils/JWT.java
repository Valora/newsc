package com.sc.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * 生成Token。
 * Created by valora on 2017/4/5.
 */
public class JWT {
    //解析Jwt
    public static Claims parseJWT(String jsonWebToken) {
        try {
            Claims claims = Jwts.parser()
                    //签名
                    .setSigningKey("")
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        } catch (Exception ex) {
            return null;
        }
    }
    
    //生成token
    public static String createJWT(String account){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        JwtBuilder builder = Jwts.builder()
                .setHeaderParam("type", "JWT")  //头信息
                .claim("account", account)  //数据声明信息
                //.setExpiration()  //过期时间设置。
                .signWith(signatureAlgorithm,""); //签名
        
        return builder.compact();
    }
}

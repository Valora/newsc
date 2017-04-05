package com.sc.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * 生成Token。
 * Created by valora on 2017/4/5.
 */
public class JwtHelper {
    //解析Jwt
    public static Claims parseJWT(String jsonWebToken) {
        try {
            Claims claims = Jwts.parser()
//                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Security))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static String createJWT(String account){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

//        byte[] apiLeySecretBytes = DatatypeConverter.parseBase64Binary(base64Security);
//        Key signingKey = new SecretKeySpec(apiLeySecretBytes, signatureAlgorithm.getJcaName());

        JwtBuilder builder = Jwts.builder()
                .setHeaderParam("type", "JWT")  //头信息
                .claim("account", account);  //数据声明信息
                //.setExpiration()  //过期时间设置。
//                .signWith(signatureAlgorithm, signingKey); //签名
        
        return builder.compact();
    }
}

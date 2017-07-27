package com.sc.utils;

import com.sc.dao.RadCodeDao;
import com.sc.domain.generator.RadCode;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Token操作类
 * Created by valora on 2017/4/27.
 */
@Component
public class JWT {
    private final RadCodeDao radCodeDao;

    @Autowired
    public JWT(RadCodeDao radCodeDao) {
        this.radCodeDao = radCodeDao;
    }

    //检查token
    public Token checkJWT(String jsonWebToken) {
        Token token = new Token();
        Claims claims = parseJWT(jsonWebToken);
        if (claims == null) {
            return null;
        }
        String userID = (String) claims.get("userId");
        Integer code = (Integer) claims.get("code");
        List<RadCode> result = radCodeDao.getRcByUserID(userID);
        if (result.isEmpty()) {
            return null;
        }
        if (result.size() == 1) {
            Integer resultcode = result.get(0).getCM_CODE();
            if (code.equals(resultcode)) {
                token.setUserId(userID);
                token.setCode(code);
                return token;
            }
        }
        return null;
    }

    //解析Jwt
    private Claims parseJWT(String jsonWebToken) {
        try {
            return Jwts.parser()
                    .setSigningKey("secret")
                    .parseClaimsJws(jsonWebToken).getBody();
        } catch (Exception ex) {
            return null;
        }
    }

    //生成token
    public String createJWT(String userId){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS512;
        int code = Integer.parseInt(GetRandomNumber.genRandomNum(5));
        List<RadCode> result = radCodeDao.getRcByUserID(userId);
        if (result.size() == 0) {
            radCodeDao.insert(userId, code);
        } else {
            radCodeDao.updateCode(userId, code);
        }

        //生成claims
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        claims.put("code", code);

        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                .signWith(signatureAlgorithm,"secret"); //签名
        return builder.compact();
    }
}

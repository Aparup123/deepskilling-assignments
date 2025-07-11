package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.util.*;

@RestController
public class AuthenticationController {

    private final Logger logger= LoggerFactory.getLogger(AuthenticationController.class);

    private String getUser(String authHeader){
        String[] header=authHeader.split(" ");
        String encodedText=header[1];
        String decodedText= new String(Base64.getDecoder().decode(encodedText));
        return decodedText.split(":")[0];
    }




    public static String generateJwt(String subject) {
        String SECRET = "my-super-secret-key-which-is-at-least-32-bytes";
        Key key = new SecretKeySpec(SECRET.getBytes(StandardCharsets.UTF_8),
                SignatureAlgorithm.HS256.getJcaName());

        return Jwts.builder()
                .subject(subject)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1200000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }



    @GetMapping("/authenticate")
    public Map<String, String > authenticate(@RequestHeader("Authorization") String authHeader){
        logger.info("Start authenticate() method");
        logger.debug(authHeader);
        String userName=getUser(authHeader);
        Map<String, String> m=new HashMap<>();
        m.put("token", generateJwt(userName));
        logger.info("End authenticate() method");
        return m;
    }
}

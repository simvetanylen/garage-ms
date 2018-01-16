package com.garagems.garageserver.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.*;
import org.springframework.security.oauth2.common.*;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.util.Assert;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomJwtAccessTokenConverter extends JwtAccessTokenConverter {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper() {{
        enable(SerializationFeature.INDENT_OUTPUT);
    }};

    public CustomJwtAccessTokenConverter() {
        super();
    }

    public OAuth2AccessToken extractAccessToken(String value, Map<String, ?> map) {
        OAuth2AccessToken result = super.extractAccessToken(value, map);
        System.out.println("extractAccessToken");
        try {
            System.out.println(OBJECT_MAPPER.writeValueAsString(result));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
        OAuth2Authentication result = super.extractAuthentication(map);
        System.out.println("extractAuthentication");
        try {
            System.out.println(OBJECT_MAPPER.writeValueAsString(result));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean isRefreshToken(OAuth2AccessToken token) {
        boolean result = super.isRefreshToken(token);
        System.out.println("isRefreshToken");
        try {
            System.out.println(OBJECT_MAPPER.writeValueAsString(result));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected Map<String, Object> decode(String token) {
        Map<String, Object> result = super.decode(token);
        System.out.println("decode");
        try {
            System.out.println(OBJECT_MAPPER.writeValueAsString(result));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

}

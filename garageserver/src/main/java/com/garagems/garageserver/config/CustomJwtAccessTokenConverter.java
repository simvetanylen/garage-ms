package com.garagems.garageserver.config;

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

    public CustomJwtAccessTokenConverter() {
        super();
    }

    public void setAccessTokenConverter(AccessTokenConverter tokenConverter) {
        super.setAccessTokenConverter(tokenConverter);
    }

    public AccessTokenConverter getAccessTokenConverter() {
        return super.getAccessTokenConverter();
    }

    public Map<String, ?> convertAccessToken(OAuth2AccessToken token, OAuth2Authentication authentication) {
        return super.convertAccessToken(token, authentication);
    }

    public OAuth2AccessToken extractAccessToken(String value, Map<String, ?> map) {
        return super.extractAccessToken(value, map);
    }

    public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
        return super.extractAuthentication(map);
    }

    public void setVerifier(SignatureVerifier verifier) {
        super.setVerifier(verifier);
    }

    public void setSigner(Signer signer) {
        super.setSigner(signer);
    }

    public Map<String, String> getKey() {
        return super.getKey();
    }

    public void setKeyPair(KeyPair keyPair) {
        super.setKeyPair(keyPair);
    }

    public void setSigningKey(String key) {
        super.setSigningKey(key);
    }

    public boolean isPublic() {
        return super.isPublic();
    }

    public void setVerifierKey(String key) {
        super.setVerifierKey(key);
    }

    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        return super.enhance(accessToken, authentication);
    }

    public boolean isRefreshToken(OAuth2AccessToken token) {
        return super.isRefreshToken(token);
    }

    protected String encode(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        return super.encode(accessToken, authentication);
    }

    protected Map<String, Object> decode(String token) {
        return super.decode(token);
    }

    public void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet();
    }
}

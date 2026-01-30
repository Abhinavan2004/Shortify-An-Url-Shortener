package com.abhinav.URL_SHORTNER_APP.utils;

import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class UrlUtils {

    public boolean isValid(String url) {
        try {
            URI.create(url).toURL();
            return true ;
        } catch (Exception e) {
            return false;
        }
    }
}

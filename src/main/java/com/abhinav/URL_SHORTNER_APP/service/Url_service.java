package com.abhinav.URL_SHORTNER_APP.service;

import com.abhinav.URL_SHORTNER_APP.utils.UrlUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Url_service {

    @Autowired
    private final UrlUtils urlUtils;

    public String Url_Shorten(String url){
        boolean isValid = urlUtils.isValid(url);
        if(!isValid){
            throw new RuntimeException("URL is Not Valid1!!!");
        }
        return null ;
    }
}

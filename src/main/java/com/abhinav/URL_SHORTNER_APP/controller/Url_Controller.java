package com.abhinav.URL_SHORTNER_APP.controller;

import com.abhinav.URL_SHORTNER_APP.service.Url_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Url_Controller {

    @Autowired
    private Url_service url_service;

    @PostMapping
    public String Url_Shorten(String url){
        return url_service.Url_Shorten(url);
    }

}

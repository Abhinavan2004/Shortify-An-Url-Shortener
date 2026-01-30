package com.abhinav.URL_SHORTNER_APP.controller;

import com.abhinav.URL_SHORTNER_APP.dto.ShortenUrlRequestDto;
import com.abhinav.URL_SHORTNER_APP.dto.ShortenUrlResponseDto;
import com.abhinav.URL_SHORTNER_APP.service.Url_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Url_Controller {

    @Autowired
    private Url_service url_service;

    @PostMapping("/shorten")
    public ShortenUrlResponseDto Url_Shorten(@RequestBody ShortenUrlRequestDto requestDto){

        return url_service.Url_Shorten(requestDto);
    }

}

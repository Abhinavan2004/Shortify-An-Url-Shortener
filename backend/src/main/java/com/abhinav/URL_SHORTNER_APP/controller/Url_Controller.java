package com.abhinav.URL_SHORTNER_APP.controller;

import com.abhinav.URL_SHORTNER_APP.dto.ShortenUrlRequestDto;
import com.abhinav.URL_SHORTNER_APP.dto.ShortenUrlResponseDto;
import com.abhinav.URL_SHORTNER_APP.service.Url_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
@RestController
public class Url_Controller {

    @Autowired
    private Url_service url_service;

    @PostMapping("/shorten")
    public ShortenUrlResponseDto Url_Shorten(@RequestBody ShortenUrlRequestDto requestDto){

        return url_service.Url_Shorten(requestDto);
    }

    @GetMapping("/{shortenCode}")
    public ResponseEntity<Void> getRedirectionUri(@PathVariable String shortenCode){
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY.value())
                .location(url_service.getRedirectionUri(shortenCode))
                        .build();
    }

}

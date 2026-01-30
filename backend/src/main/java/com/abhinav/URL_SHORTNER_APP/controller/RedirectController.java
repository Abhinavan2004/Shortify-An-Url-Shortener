package com.abhinav.URL_SHORTNER_APP.controller;

import java.net.URI;

import com.abhinav.URL_SHORTNER_APP.service.Url_service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {

    private final Url_service url_service;

    public RedirectController(Url_service url_service) {
        this.url_service = url_service;
    }

    @GetMapping("/{shortCode}")
    public ResponseEntity<Void> redirect(@PathVariable String shortCode) {

        URI redirectUri = url_service.getRedirectionUri(shortCode);

        return ResponseEntity
                .status(HttpStatus.FOUND) // 302
                .location(redirectUri)
                .build();
    }
}

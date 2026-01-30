package com.abhinav.URL_SHORTNER_APP.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class ShortenUrlResponseDto {
    private String ShortenCode ;
}


package com.abhinav.URL_SHORTNER_APP.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ShortenUrlResponseDto {
    private String ShortenCode ;
}


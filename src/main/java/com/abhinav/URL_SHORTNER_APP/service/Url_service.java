package com.abhinav.URL_SHORTNER_APP.service;

import ch.qos.logback.core.testUtil.RandomUtil;
import com.abhinav.URL_SHORTNER_APP.dto.ShortenUrlRequestDto;
import com.abhinav.URL_SHORTNER_APP.dto.ShortenUrlResponseDto;
import com.abhinav.URL_SHORTNER_APP.entity.Url_entity;
import com.abhinav.URL_SHORTNER_APP.repository.Url_Repo;
import com.abhinav.URL_SHORTNER_APP.utils.UrlUtils;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Url_service {

    @Autowired
    private final UrlUtils urlUtils;
    @Autowired
    private final Url_Repo repo ;

    public ShortenUrlResponseDto Url_Shorten(ShortenUrlRequestDto requestDto){
        String url = requestDto.getUrl() ;
        try{
            boolean isValid = urlUtils.isValid(url);
            if(!isValid){
                throw new RuntimeException("URL is Not Valid1!!!");
            }

            String ShortenCode = "TODO" ;
            Url_entity url_entity = new Url_entity();
            url_entity.setUrl(url);
            url_entity.setShortenCode(ShortenCode);
            repo.save(url_entity);
            return ShortenUrlResponseDto.builder().ShortenCode(ShortenCode).build();
        }
        catch(DataIntegrityViolationException e){
            String ShortenCode = RandomStringUtils.randomAlphanumeric(8);
            Url_entity url_entity = new Url_entity();
            url_entity.setUrl(url);
            url_entity.setShortenCode(ShortenCode);
            repo.save(url_entity);
            return ShortenUrlResponseDto.builder().ShortenCode(ShortenCode).build();
        }
    }
}

package com.abhinav.URL_SHORTNER_APP.repository;

import com.abhinav.URL_SHORTNER_APP.entity.Url_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Url_Repo extends JpaRepository<Url_entity , Long> {

    Optional<Url_entity> findByShortenCode(String shortenCode);
}

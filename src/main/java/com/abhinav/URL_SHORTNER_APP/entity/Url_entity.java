package com.abhinav.URL_SHORTNER_APP.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@Component
@RequiredArgsConstructor
@Table(name="URL_SHORTENER_APP_TABLE")
public class Url_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name="Actual Url")
    private String url;

    @Column(unique = true)
    private String shortenCode;

}

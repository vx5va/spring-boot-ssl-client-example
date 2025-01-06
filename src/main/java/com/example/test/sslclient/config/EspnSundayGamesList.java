package com.example.test.sslclient.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EspnSundayGamesList {

    public EspnSundayGamesList(SslRestTemplateConfig sslRestTemplateConfig) {

        RestTemplate restTemplate = sslRestTemplateConfig.getRestTemplate();

		String url = "https://site.api.espn.com/apis/site/v2/sundaynightfootball";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");

		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		System.out.println("** Response ** " + response.getBody());
    }
}

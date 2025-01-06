package com.example.test.sslclient.config;

import org.springframework.boot.ssl.SslBundle;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SslRestTemplateConfig {

    private final RestTemplate restTemplate;

    public SslRestTemplateConfig(SslBundles sslBundles, RestTemplateBuilder restTemplateBuilder) {

            SslBundle sslBundle = sslBundles.getBundle("vics-bundle");

            this.restTemplate = restTemplateBuilder.setSslBundle(sslBundle).build();
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    
    // @Bean
    // public RestTemplate restTemplate() throws Exception {
    //     TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

    //     SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
    //             .loadTrustMaterial(null, acceptingTrustStrategy)
    //             .build();

    //     SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

    //     CloseableHttpClient httpClient = HttpClients.custom()
    //             .setSSLSocketFactory(csf)
    //             .build();

    //     HttpComponentsClientHttpRequestFactory requestFactory =
    //             new HttpComponentsClientHttpRequestFactory();

    //     requestFactory.setHttpClient(httpClient);
    //     RestTemplate restTemplate = new RestTemplate(requestFactory);
    //     return restTemplate;
    // }
}

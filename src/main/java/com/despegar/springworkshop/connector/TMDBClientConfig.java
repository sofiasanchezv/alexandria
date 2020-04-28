package com.despegar.springworkshop.connector;

import com.despegar.springworkshop.config.TMDBConfig;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Component
public class TMDBClientConfig {

    @Bean
    @Autowired
    public RestTemplate tmdbClient(TMDBConfig tmdbConfig, TMDBErrorHandler TMDBErrorHandler) {
        var requestConfig = RequestConfig.custom().setConnectTimeout(tmdbConfig.getTimeout()).setSocketTimeout(tmdbConfig.getConnectionTimeout()).build();
        CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
        RestTemplate restTemplate = new RestTemplate(factory);
        restTemplate.setErrorHandler(TMDBErrorHandler);
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(tmdbConfig.getHost()));
        return restTemplate;
    }
}

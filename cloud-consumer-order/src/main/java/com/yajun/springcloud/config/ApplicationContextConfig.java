package com.yajun.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 *
 * 功能描述: 发送http请求的restTemplate 功能类似httpClient
 *
 * @param:
 * @return:
 * @auther: zyj
 * @date: 2020/6/14 21:10
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
package com.canon.config;

import com.canon.base.util.BaseHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: canon-dependencies
 * @Package: com.canon.config
 * @ClassName: RestTemplate
 * @Author: 0227544
 * @Description:
 * @Date: 2020/1/15 17:13
 * @Version: 1.0
 */
@Configuration
public class RestConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpMessageConverters getHttpMessageConverter() {
        return new HttpMessageConverters(new BaseHttpMessageConverter());
    }
}

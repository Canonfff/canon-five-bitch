package com.canon.base.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: five-bitch
 * @Auther: canon
 * @Date: 2019/12/24 17:31
 * @Description:
 */
@Configuration
//@AutoConfigureAfter(DruidConfig.class)
public class MybatisConfig {



    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(@Value("${mybatis.basePackage}") String basePackage) {
        System.err.println(basePackage);
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // basePackage = "com.*.dao";
        mapperScannerConfigurer.setBasePackage(basePackage);
        return mapperScannerConfigurer;
    }


}

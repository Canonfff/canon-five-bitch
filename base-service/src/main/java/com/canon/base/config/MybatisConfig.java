package com.canon.base.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @program: five-bitch
 * @Auther: canon
 * @Date: 2019/12/24 17:31
 * @Description:
 */
@Configuration
// @ConditionalOnSingleCandidate(DataSource.class)
// @EnableTransactionManagement

public class MybatisConfig {


    private DataSource dataSource;

    @Autowired
    public DataSource getDataSource() {
        return dataSource;
    }


    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(@Value("${canon.mybatis.basePackage}") String basePackage) {
        System.err.println(basePackage);
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        basePackage = "com.*.dao";
        mapperScannerConfigurer.setBasePackage(basePackage);
        return mapperScannerConfigurer;
    }


}

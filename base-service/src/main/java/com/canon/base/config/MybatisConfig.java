package com.canon.base.config;

import com.canon.base.mybatis.ExecutorInterceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
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
public class MybatisConfig {

    /**
     * 配置mybatis的包扫描
     * @param basePackage
     * @return
     */
    @Bean("mapperScannerConfigurer")
    public MapperScannerConfigurer getMapperScannerConfigurer(@Value("${canon.mybatisBasePackage}") String basePackage) {
        System.err.println(basePackage);
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // basePackage = "com.*.dao";
        mapperScannerConfigurer.setBasePackage(basePackage);
        return mapperScannerConfigurer;
    }

    /**
     * 配置mybatis sql拦截器
     * @return
     */
    @Bean("configurationCustomizer")
    public ConfigurationCustomizer getConfigurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.addInterceptor(new ExecutorInterceptor());
            }
        };
    }

}

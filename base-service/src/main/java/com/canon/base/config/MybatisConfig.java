package com.canon.base.config;

import com.canon.base.mybatis.ExecutorInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger log = LoggerFactory.getLogger(MybatisConfig.class);

    /**
     * 配置mybatis的包扫描
     * @param basePackage
     * @return
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(@Value("${canon.mybatisBasePackage}") String basePackage) {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage(basePackage);
        return mapperScannerConfigurer;
    }
    /**
     * 配置mybatis sql拦截器
     * @return
     */
//    @Bean
//    public ConfigurationCustomizer configurationCustomizer() {
//        return new ConfigurationCustomizer() {
//            @Override
//            public void customize(org.apache.ibatis.session.Configuration configuration) {
//                configuration.addInterceptor(new ExecutorInterceptor());
//
//            }
//        };
//    }

    @Bean
    public Interceptor executorInterceptor() {
        ExecutorInterceptor interceptor = new ExecutorInterceptor();
        return interceptor;
    }

}

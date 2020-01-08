package com.canon.base.config;

import com.canon.base.mybatis.CanonMapperScannerConfigurer;
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


//    @Bean
//    public FactoryBean getMabatisFactory() {
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//
//        return sqlSessionFactoryBuilder.build(null);
//    }


    @Value("${canon.mybatis.basePackage}")
    private String basePackage;


    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new CanonMapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage(basePackage);
        return mapperScannerConfigurer;
    }

}

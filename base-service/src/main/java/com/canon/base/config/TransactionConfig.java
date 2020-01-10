package com.canon.base.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@AutoConfigureAfter(DruidConfig.class)
@EnableTransactionManagement
public class TransactionConfig implements TransactionManagementConfigurer {

    @Resource(name = "txManager1")
    private PlatformTransactionManager txManager1;

    /**
     * 默认使用txManager1
     * @param dataSource
     * @return
     */
    @Bean(name = "txManager1")
    public PlatformTransactionManager txManager1(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * 事务管理器2
     * @param factory
     * @return
     */
    @Bean(name = "txManager2")
    public PlatformTransactionManager txManager2(EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }


    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return txManager1;
    }
}

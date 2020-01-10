package com.canon.base.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.annotation.Order;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/10 10:57
 * @Description:由于占位符的解析比 {@link org.mybatis.spring.mapper.MapperScannerConfigurer}
 * 加载更慢,因此;需要将占位符的解析往前;
 */
@Configuration
@Order(1)
public class CanonPropertySourcesPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // 占位符解析
        super.postProcessBeanFactory((ConfigurableListableBeanFactory) registry);
    }
}

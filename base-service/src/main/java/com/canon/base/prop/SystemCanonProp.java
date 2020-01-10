package com.canon.base.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 18:49
 * @Description:配置文件
 */
@ConfigurationProperties(prefix = SystemCanonProp.CANON_PREFIX)
public class SystemCanonProp {

    public static final String CANON_PREFIX = "canon";

    private String mybatisBasePackage;

    public String getMybatisBasePackage() {
        return mybatisBasePackage;
    }

    public void setMybatisBasePackage(String mybatisBasePackage) {
        this.mybatisBasePackage = mybatisBasePackage;
    }
}

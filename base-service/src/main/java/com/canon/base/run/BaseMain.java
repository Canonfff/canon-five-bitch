package com.canon.base.run;

import org.mybatis.spring.annotation.MapperScan;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/7 18:01
 * @Description:
 */
@MapperScan(basePackages = "com.canon.*.dao")
public class BaseMain extends Main {

}

package com.canon.base.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: five-bitch
 * @Auther: canon
 * @Date: 2019/12/6 13:18
 * @Description:@ComponentScan(basePackageClasses={MarkerInterface.class}) 这种形式也可以进行包扫描
 */
@SpringBootApplication
@ComponentScan("com.canon.*")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

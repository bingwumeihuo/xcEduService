package com.yixin.edu.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 17:13
 **/
@SpringBootApplication
@EntityScan("com.yixin.edu.model.cms")//扫描实体类
@ComponentScan(basePackages={"com.yixin.edu.api"})//扫描接口
@ComponentScan(basePackages={"com.yixin.edu.manage"})//扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
    }
}

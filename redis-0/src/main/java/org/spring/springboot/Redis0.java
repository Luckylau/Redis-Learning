package org.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author luckylau
 * @date 2017/12/12/012 11:12
 */


@ImportResource(value = {"classpath:applicationContext.xml"})
@SpringBootApplication
public class Redis0 {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Redis0.class, args);
    }
}

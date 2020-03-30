package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApplication
 * @Description TODO
 * @Author lihaoyi
 * @Date 2020/3/11 19:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka802ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka802ServerApplication.class);
    }
}

package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName AddressApplication
 * @Description TODO
 * @Author lihaoyi
 * @Date 2020/3/11 16:01
 * @Version 1.0
 **/
@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication
@EnableEurekaClient
public class AddressApplication {
    public static void main(String[] args) {
        SpringApplication.run(AddressApplication.class, args);
    }
}

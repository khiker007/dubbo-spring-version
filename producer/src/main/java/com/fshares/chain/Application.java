package com.fshares.chain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName Application
 * @Deacription TODO
 * @Author khike
 * @Date 2019/12/31 19:18
 * @Version 1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}

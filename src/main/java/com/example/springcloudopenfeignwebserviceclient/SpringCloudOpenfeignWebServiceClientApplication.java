package com.example.springcloudopenfeignwebserviceclient;

import feign.Feign;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.cloud.openfeign.FeignClientFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@RequiredArgsConstructor
public class SpringCloudOpenfeignWebServiceClientApplication {
    private final PostServiceImpl postService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOpenfeignWebServiceClientApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner() {
//        return (param) -> {
//            System.out.println(postService.getAllPosts());
//        };
//    }
}

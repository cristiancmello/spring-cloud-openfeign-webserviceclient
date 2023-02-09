package com.example.springcloudopenfeignwebserviceclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
    name = "postFeignClient",
    configuration = FeignClientConfig.class,
    url = "${client.post.baseUrl}"
)
public interface PostFeignClient {
    @GetMapping(value = "/posts")
    List<Post> getAllPosts();
}
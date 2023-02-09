package com.example.springcloudopenfeignwebserviceclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl {
    private final PostFeignClient postFeignClient;

    public List<Post> getAllPosts() {
        return postFeignClient.getAllPosts();
    }
}

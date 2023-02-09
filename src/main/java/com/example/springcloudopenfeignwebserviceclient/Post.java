package com.example.springcloudopenfeignwebserviceclient;

import lombok.ToString;
import lombok.Value;

@Value
@ToString
public class Post {
    Long id;
    Long userId;
    String title;
    String body;
}
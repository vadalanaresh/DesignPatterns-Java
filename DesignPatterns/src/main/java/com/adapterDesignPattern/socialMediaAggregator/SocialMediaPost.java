package com.adapterDesignPattern.socialMediaAggregator;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocialMediaPost {
    private String id;
    private String message;
    private Long userId;
    private Long timestamp;
}

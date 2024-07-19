package com.adapterDesignPattern.socialMediaAggregator.external;

import com.adapterDesignPattern.socialMediaAggregator.SocialMediaPost;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;
}
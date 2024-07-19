package com.adapterDesignPattern.socialMediaAggregator.external;


import java.util.List;

import static com.adapterDesignPattern.socialMediaAggregator.external.ApiUtils.logFacebookGetPosts;
import static com.adapterDesignPattern.socialMediaAggregator.external.ApiUtils.logFacebookPostStatus;

public class FacebookApi {

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        logFacebookPostStatus();
    }
}
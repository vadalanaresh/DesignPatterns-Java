package com.adapterDesignPattern.socialMediaAggregator.external;

import java.util.List;

import static com.adapterDesignPattern.socialMediaAggregator.external.ApiUtils.logTwitterGetPosts;
import static com.adapterDesignPattern.socialMediaAggregator.external.ApiUtils.logTwitterPostStatus;

public class TwitterApi {

    public List<TwitterTweet> getTweets(Long userId) {
        // Implementation to fetch Twitter tweets
        logTwitterGetPosts();
        return List.of(new TwitterTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {
        // Implementation to send a tweet on Twitter
        logTwitterPostStatus();
    }
}


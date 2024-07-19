package com.adapterDesignPattern.socialMediaAggregator;

import java.util.List;

public class SocialMediaManager {

    public void getMessages(Long userId, Long timestamp, String platform) {

        SocialMediaAdapter socialMediaAdapter = SocialMediaFactory.getSocialMedia(platform);
        List<SocialMediaPost> messages = socialMediaAdapter.getMessages(userId, timestamp);
        // Convert the posts/tweets to a common format
    }
}
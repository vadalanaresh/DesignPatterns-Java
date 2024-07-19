package com.adapterDesignPattern.socialMediaAggregator;

import com.adapterDesignPattern.socialMediaAggregator.external.TwitterApi;
import com.adapterDesignPattern.socialMediaAggregator.external.TwitterTweet;

import java.util.ArrayList;
import java.util.List;

public class Twitter implements SocialMediaAdapter {
    @Override
    public void postUpdate(Long userId, String message) {
        new TwitterApi().tweet(userId, message);
    }

    @Override
    public List<SocialMediaPost> getMessages(Long userId, Long timestamp) {
        TwitterApi twitter = new TwitterApi();
        List<TwitterTweet> twitterTweets = twitter.getTweets(userId);
        return convertToSocialMediaPost(twitterTweets);
    }

    private List<SocialMediaPost> convertToSocialMediaPost(List<TwitterTweet> twitterTweets) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (TwitterTweet twitterTweet : twitterTweets) {
            SocialMediaPost socialMediaPost = new SocialMediaPost();
            socialMediaPost.setId(twitterTweet.getId());
            socialMediaPost.setUserId(twitterTweet.getUserId());
            socialMediaPost.setMessage(twitterTweet.getTweet());

            socialMediaPosts.add(socialMediaPost);
        }
        return socialMediaPosts;
    }
}

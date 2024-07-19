package com.adapterDesignPattern.socialMediaAggregator;

import com.adapterDesignPattern.socialMediaAggregator.external.FacebookPost;
import com.adapterDesignPattern.socialMediaAggregator.external.TwitterTweet;

import java.util.List;

public class SocialMediaFactory {
    public static SocialMediaAdapter getSocialMedia(String platform){
        if (platform.equals("facebook")) {
            return new Facebook();
        } else if (platform.equals("twitter")) {
            return new Twitter();
        }
        return null;
    }
}

package com.adapterDesignPattern.socialMediaAggregator;

import com.adapterDesignPattern.socialMediaAggregator.external.FacebookApi;
import com.adapterDesignPattern.socialMediaAggregator.external.FacebookPost;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialMediaAdapter {
    @Override
    public void postUpdate(Long userId, String message) {
        new FacebookApi().postFacebookStatus(userId, message);
    }

    @Override
    public List<SocialMediaPost> getMessages(Long userId, Long timestamp) {
        FacebookApi facebookApi = new FacebookApi();
        List<FacebookPost> facebookPosts = facebookApi.fetchFacebookPosts(userId, timestamp);
        return convertToSocialMediaPosts(facebookPosts);
    }

    private List<SocialMediaPost> convertToSocialMediaPosts(List<FacebookPost> facebookPosts) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (FacebookPost facebookPost : facebookPosts) {

            SocialMediaPost socialMediaPost = new SocialMediaPost();
            socialMediaPost.setId(facebookPost.getId());
            socialMediaPost.setMessage(facebookPost.getStatus());
            socialMediaPost.setTimestamp(facebookPost.getTimestamp());
            socialMediaPost.setUserId(facebookPost.getUserId());

            socialMediaPosts.add(socialMediaPost);
        }
        return socialMediaPosts;
    }
}

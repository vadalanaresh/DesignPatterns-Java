package com.adapterDesignPattern.socialMediaAggregator;

import java.util.List;

public interface SocialMediaAdapter {
    void postUpdate(Long userId, String message);
    List<SocialMediaPost> getMessages(Long userId, Long timestamp);
}

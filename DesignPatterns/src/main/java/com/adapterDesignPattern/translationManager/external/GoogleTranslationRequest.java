package com.adapterDesignPattern.translationManager.external;

import com.adapterDesignPattern.translationManager.TranslationRequest;
import lombok.Getter;

@Getter
public class GoogleTranslationRequest extends TranslationRequest {
    private Double confidenceThreshold;
    public GoogleTranslationRequest(String text, String sourceLanguage, String targetLanguage, Double confidenceThreshold) {
        super(text, sourceLanguage, targetLanguage);
        this.confidenceThreshold = confidenceThreshold;
    }
}
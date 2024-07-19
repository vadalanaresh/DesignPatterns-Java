package com.adapterDesignPattern.translationManager;

import com.adapterDesignPattern.translationManager.external.GoogleTranslateApi;
import com.adapterDesignPattern.translationManager.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslator implements TranslationProviderAdapter {
    GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        GoogleTranslationRequest googleTranslationRequest = new GoogleTranslationRequest(translationRequest.getText(),translationRequest.getSourceLanguage(),translationRequest.getTargetLanguage(),0.8);
        return googleTranslateApi.convert(googleTranslationRequest);
    }

    @Override
    public List<String> getLanguages() {
        return googleTranslateApi.getLanguages();
    }
}

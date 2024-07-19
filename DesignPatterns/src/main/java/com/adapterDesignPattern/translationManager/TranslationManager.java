package com.adapterDesignPattern.translationManager;

import com.adapterDesignPattern.translationManager.external.GoogleTranslationRequest;

public class TranslationManager {

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {

        TranslationProviderAdapter translationProviderAdapter = TranslatorFactory.getTranslator("google");
        GoogleTranslationRequest request = new GoogleTranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
        translationProviderAdapter.translate(request);

        translationProviderAdapter = TranslatorFactory.getTranslator("microsoft");
        TranslationRequest microsoftTranslator = new TranslationRequest();
        return translationProviderAdapter.translate(microsoftTranslator);
    }

}
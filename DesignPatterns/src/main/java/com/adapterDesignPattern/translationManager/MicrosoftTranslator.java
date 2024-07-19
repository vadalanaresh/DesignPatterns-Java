package com.adapterDesignPattern.translationManager;


import com.adapterDesignPattern.translationManager.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslator implements TranslationProviderAdapter {
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();
    @Override
    public String translate(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(translationRequest.getText(),translationRequest.getSourceLanguage(),translationRequest.getTargetLanguage());
    }

    @Override
    public List<String> getLanguages() {

        return microsoftTranslateApi.getSupportedLanguages();
    }
}

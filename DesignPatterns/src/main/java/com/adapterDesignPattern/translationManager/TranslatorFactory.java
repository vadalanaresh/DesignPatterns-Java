package com.adapterDesignPattern.translationManager;

public class TranslatorFactory {

    public static TranslationProviderAdapter getTranslator(String provider) {

        if (provider.equals("google")) {
            return new GoogleTranslator();
        } else if (provider.equals("microsoft")) {
            return new  MicrosoftTranslator();
        } else {
            throw new RuntimeException("Invalid provider");
        }
    }
}

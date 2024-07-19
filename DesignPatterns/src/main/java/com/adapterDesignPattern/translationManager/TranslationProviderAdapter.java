package com.adapterDesignPattern.translationManager;

import java.util.List;

public interface TranslationProviderAdapter {
    String translate(TranslationRequest translationRequest);
    List<String> getLanguages();
}

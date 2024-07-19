package com.factory.audioPlayerAbstractFactory.decoder;


import com.factory.audioPlayerAbstractFactory.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] decode();
}
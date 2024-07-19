package com.factory.audioPlayerAbstractFactory;

import com.factory.audioPlayerAbstractFactory.decoder.AudioDecoder;
import com.factory.audioPlayerAbstractFactory.decoder.FLACDecoder;
import com.factory.audioPlayerAbstractFactory.player.AudioPlayer;
import com.factory.audioPlayerAbstractFactory.player.FLACPlayer;
import com.factory.audioPlayerAbstractFactory.processor.AudioProcessor;
import com.factory.audioPlayerAbstractFactory.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder CreateAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioPlayer CreateAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor CreateAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }
}



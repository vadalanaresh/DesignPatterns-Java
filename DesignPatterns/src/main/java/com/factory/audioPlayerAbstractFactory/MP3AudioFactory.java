package com.factory.audioPlayerAbstractFactory;

import com.factory.audioPlayerAbstractFactory.decoder.AudioDecoder;
import com.factory.audioPlayerAbstractFactory.decoder.MP3Decoder;
import com.factory.audioPlayerAbstractFactory.player.AudioPlayer;
import com.factory.audioPlayerAbstractFactory.player.MP3Player;
import com.factory.audioPlayerAbstractFactory.processor.AudioProcessor;
import com.factory.audioPlayerAbstractFactory.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder CreateAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioPlayer CreateAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor CreateAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }
}

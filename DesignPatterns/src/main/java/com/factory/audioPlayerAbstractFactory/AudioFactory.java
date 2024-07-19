package com.factory.audioPlayerAbstractFactory;

import com.factory.audioPlayerAbstractFactory.decoder.AudioDecoder;
import com.factory.audioPlayerAbstractFactory.player.AudioPlayer;
import com.factory.audioPlayerAbstractFactory.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();
    public abstract AudioDecoder CreateAudioDecoder(byte[] audioData);
    public abstract AudioPlayer CreateAudioPlayer(int volume, double playbackRate);
    public abstract AudioProcessor CreateAudioProcessor(byte[] audioData);
}

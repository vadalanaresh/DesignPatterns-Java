package Factory.audioPlayerAbstractFactory;

import Factory.audioPlayerAbstractFactory.decoder.AudioDecoder;
import Factory.audioPlayerAbstractFactory.decoder.FLACDecoder;
import Factory.audioPlayerAbstractFactory.player.AudioPlayer;
import Factory.audioPlayerAbstractFactory.player.FLACPlayer;
import Factory.audioPlayerAbstractFactory.processor.AudioProcessor;
import Factory.audioPlayerAbstractFactory.processor.FLACAudioProcessor;

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



package Factory.audioPlayerAbstractFactory;

import Factory.audioPlayerAbstractFactory.decoder.AudioDecoder;
import Factory.audioPlayerAbstractFactory.decoder.MP3Decoder;
import Factory.audioPlayerAbstractFactory.player.AudioPlayer;
import Factory.audioPlayerAbstractFactory.player.MP3Player;
import Factory.audioPlayerAbstractFactory.processor.AudioProcessor;
import Factory.audioPlayerAbstractFactory.processor.MP3AudioProcessor;

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

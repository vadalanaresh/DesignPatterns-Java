package Factory.audioPlayerAbstractFactory;

import Factory.audioPlayerAbstractFactory.decoder.AudioDecoder;
import Factory.audioPlayerAbstractFactory.player.AudioPlayer;
import Factory.audioPlayerAbstractFactory.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();
    public abstract AudioDecoder CreateAudioDecoder(byte[] audioData);
    public abstract AudioPlayer CreateAudioPlayer(int volume, double playbackRate);
    public abstract AudioProcessor CreateAudioProcessor(byte[] audioData);
}

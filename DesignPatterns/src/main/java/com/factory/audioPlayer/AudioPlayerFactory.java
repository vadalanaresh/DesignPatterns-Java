package com.factory.audioPlayer;

public class AudioPlayerFactory {

    public static AudioPlayer createAudioPlayer(MediaFormat mediaFormat, int volume, double playbackRate) {
        return switch (mediaFormat) {
            case WAV -> new WAVPlayer(volume, playbackRate);
            case MP3 -> new MP3Player(volume, playbackRate);
            case FLAC -> new FLACPlayer(volume, playbackRate);
            default -> null;
        };
    }
}

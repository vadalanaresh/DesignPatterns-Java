package Factory.AudioPlayer;

public abstract class AudioPlayer {

/*
    public int volume;
    public double playBackRate;
*/

    public abstract MediaFormat supportsType();

    public abstract void play();

    public abstract void stop();

    public abstract void pause();

    public abstract int getVolume();

    public abstract void setVolume(int volume);

    public abstract double getPlayBackRate();
}

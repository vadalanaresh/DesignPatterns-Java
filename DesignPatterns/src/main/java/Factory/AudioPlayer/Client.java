package Factory.AudioPlayer;

public class Client {
    public static void main(String[] args) {
        AudioPlayer player = AudioPlayerFactory.createAudioPlayer(MediaFormat.MP3,12,1.00);
        player.play();
        player.pause();
        player.getPlayBackRate();
        player.stop();
    }
}

package be.Intecbrussel;

//Only play for MP3 files
public class AudioPlayer implements MediaPlayer {
    public AudioPlayer() {
    }

    MediaAdapter obj1 = new MediaAdapter();

    @Override
    public void play(String audioType, String fileName) {

        obj1.play(audioType, fileName);

    }

}

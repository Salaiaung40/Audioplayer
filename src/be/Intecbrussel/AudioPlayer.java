package be.Intecbrussel;

//Only play for MP3 files
public class AudioPlayer implements MediaPlayer {
    public AudioPlayer() {
    }

    MediaAdapter adapter1 = new MediaAdapter();

    @Override
    public void play(String audioType, String fileName) {

        adapter1.play(audioType, fileName);

    }

}

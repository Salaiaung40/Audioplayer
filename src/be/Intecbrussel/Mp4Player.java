package be.Intecbrussel;

//Step 2
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
    }
}

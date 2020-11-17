package be.Intecbrussel;

//Step 3
public class MediaAdapter implements MediaPlayer {

    public MediaAdapter() {

    }

    //AdvanceMusicPlayer   (AdvanceMediaPlayer) {private function}
    AdvanceMediaPlayer advancedMediaPlayer; // Declaration

    //MediaAdapter ( String) Method
    public MediaAdapter(String audioType) {
        this.advancedMediaPlayer = audioType.toLowerCase().contains("mp4") ? new Mp4Player() :
                                    audioType.toLowerCase().contains("vlc") ? new VlcPlayer(): null;
    }

    // play(String, String) Method
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " is not supported");
        }

    }

}


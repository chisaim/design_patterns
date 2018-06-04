package home.pb.apapter;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPalyer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4Palyer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}

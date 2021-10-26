package singleton.utilities;

public class MusicPlayer extends Application{

    public MusicPlayer() {
    }

    public MusicPlayer(int space)
    {
        this.setSpaceRequired(space);
    }

    @Override
    public void execute() {
        System.out.println("plays .mp3, .wav, .flac");
    }

}

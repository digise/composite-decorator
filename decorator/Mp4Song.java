package decorator;

import interfaces.Component;
import interfaces.SupportSong;

public class Mp4Song extends Decorator implements SupportSong {

    public Mp4Song(Component decoratorSong){
        super(decoratorSong);
    }

    @Override
    public void play() {
        decoratorSong.play();
        addSupport();
    }

    @Override
    public void addSupport() {
        System.out.println("ON MP4");
    }
}

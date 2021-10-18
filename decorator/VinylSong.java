package decorator;

import interfaces.Component;
import interfaces.SupportSong;

public class VinylSong extends Decorator implements SupportSong {

    public VinylSong(Component decoratorSong) {
        super(decoratorSong);
    }

    @Override
    public void play() {
        decoratorSong.play();
        addSupport();
    }

    @Override
    public void addSupport() {
        System.out.println("ON VINYL");
    }
}

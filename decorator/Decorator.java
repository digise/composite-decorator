package decorator;

import interfaces.Component;

public abstract class Decorator implements Component {

    protected Component decoratorSong;

    public Decorator(Component decoratorSong){
        this.decoratorSong = decoratorSong;

    }

    @Override
    public void play() {
        decoratorSong.play();
    }
}

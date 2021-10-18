package playList;

import interfaces.Component;

public class Song implements Component {
    private String name;
    private String author;

    public Song(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("Escuchando..." + name + " BY " + author);
    }

}

package playList;

import interfaces.Component;

import java.util.ArrayList;

public class PlayList implements Component {

    private String name;
    private ArrayList<Component> componentes;

    public PlayList(String name) {
        this.name = name;
        this.componentes = new ArrayList<>();
    }

    public void add(Component component ){
        componentes.add(component);
    }

    @Override
    public void play() {
        for (Component c: componentes) {
            System.out.println("-----" + name + "-----");
            c.play();
        }
    }
}

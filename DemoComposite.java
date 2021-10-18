import decorator.Mp4Song;
import decorator.VinylSong;
import playList.PlayList;
import playList.Song;

public class DemoComposite {
    public static void main(String[] args) {

        // Make "Sabina' hits" playlist and add 2 songs to it
        PlayList sabinaPlayList = new PlayList("Sabina's Hit");
        sabinaPlayList.add(new VinylSong(new Song("Princesa", "Joaquin Sabina")));
        sabinaPlayList.add(new Song("Calle Melancolia", "Joanquin Sabina"));

        // Make "Manolo García's hits" playlist and add 3 songs to it
        PlayList garciaPlayList = new PlayList("Manolo Garcia's Hit");
        garciaPlayList.add(new Mp4Song(new Song("Pájaros de barro", "Manolo García")));


        // Make "my songs" playlist and add teh two playlists and one single song
        PlayList mySongs = new PlayList("My songs");
        mySongs.add(sabinaPlayList);
        mySongs.add(garciaPlayList);

        // Play all songs of each playlist
        mySongs.play();
    }
}

package org.example;
import java.util.ArrayList;
import java.util.List;

public class Music extends Media{


    private String artist;




    //Constructors

    public Music(){

    }
    public Music(String artist){
        this.artist = artist;
    }
        public Music( String artist, String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }




    //Additional methods


    public void listen(User user){

        user.addToCart(this);
    }

    public List <Music> generalPlayList(List <Music> musicCatalog) {

        List<Music> gPlayList = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getAuteur().equals(this.getAuteur())) {
                gPlayList.add(music);
            }
        }
        return gPlayList;
    }


    @Override
    public String getMediaType() {
        return super.getPrice() >= 10 ? "premium Music" : "Music";
    }

    @Override
    public String toString() {
        return super.toString() +  " Artist: " + artist;
    }
}


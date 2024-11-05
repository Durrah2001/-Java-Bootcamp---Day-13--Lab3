package org.example;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {

    private int duration; //in minutes



    public void setDuration(int duration) {
        this.duration = duration;

    }

    public int getDuration() {
        return duration;
    }


    public Movie() {

    }

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(int duration, String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }


    //Methods

    public void Watch(User user) {

        user.addToCart(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {

        List<Movie> recommend = new ArrayList<>();
        for (Movie m : movieCatalog) {
            if (m.getAuteur().equals(getAuteur())) {
                recommend.add(m);
            }
        }
        return recommend;
    }


@Override
public String getMediaType() {
    return duration >= 120 ? "Long Movie" : "Movie";
}

@Override
public String toString() {
    return super.toString() +  "Duration: " + duration + " minutes";
}


}


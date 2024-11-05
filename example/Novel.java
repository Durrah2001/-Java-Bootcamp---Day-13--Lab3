package org.example;

public class Novel extends Book {

    private String genre;

        public Novel( String genre, String title, String auteur, String ISBN, double price, int stock) {
        super(stock, title, auteur, ISBN, price);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return super.getAverageRating() >= 4.5 ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return super.toString() + "Genre: " + genre;
    }
}














    //Additional methods

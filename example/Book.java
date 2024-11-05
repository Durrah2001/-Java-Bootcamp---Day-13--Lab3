package org.example;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Book extends Media{

    private int stock;   //quantity in stock
    private List <Review> rev = new ArrayList<>();


    //Constructors

    public Book(){

    }
    public Book(int stock){
        this.stock = stock;
    }

    public Book(int stock, String title, String auteur, String ISBN, double price ){
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }



    //Methods

    public void addReview(Review review){  //Recieve object

          rev.add(review);

    }

    public double getAverageRating(){

        double avg = 0.0;
        for (Review r : rev){
            avg = avg + r.getRating();
        }
        return avg / rev.size();

    }


    public void purchase(User user){

        if(stock > 0) {
            user.addToCart(this);
            stock--;
        }else
            System.out.println("Can not purchase");

    }

    public boolean isBestSeller(){

        return getAverageRating() >= 4.5;
    }

    public void restock(int stock){

        this.stock = this.stock + stock;
      System.out.println(super.getTitle() + " restocked now!");


    }




        @Override
    public String getMediaType() {
        return getAverageRating() > 4.5 ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() + " ,Quantity in Stock: " + stock + ", Average Rating: " + getAverageRating();
    }



    //Setters and getters



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }






}



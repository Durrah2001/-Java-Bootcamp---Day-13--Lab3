package org.example;
import java.util.Arrays;
import java.util.ArrayList;

public class Media {

    private String title;
    private String auteur;
    private String ISBN;
    private double price;


    public ArrayList<String> movieCatalog = new ArrayList<String>();


    //Constructors

    public Media(){

    }

    public Media(String title, String auteur, String ISBN, double price){
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;

    }




    //Setters

    public void setTitle(String title){

        this.title = title;
    }

    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Getters

    public String getTitle(){
        return title;
    }

    public String getAuteur(){
        return auteur;
    }

    public String getISBN(){
        return ISBN;
    }

    public double getPrice(){
        return price;
    }


    //Additional methods

    public String getMediaType(){
        return null;
    }

    public String toString(){

        return String.format("Title: %s , Auteur: %s, ISBN: %s, and Price: %.2f " , title, auteur, ISBN, price);
    }











}

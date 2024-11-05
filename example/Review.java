package org.example;

public class Review {


     String username;
     double rating;
     String comment;

     public void setUsername(String username){
         this.username = username;
     }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public double getRating(){
         return rating;
    }
    public String getUsername(){
        return username;
    }
    public String getComment(){
        return comment;
    }

     Review(String username, double rating, String comment){
         this.username = username;
         this.rating= rating;
         this.comment = comment;

     }





}

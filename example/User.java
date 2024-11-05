package org.example;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class User {

     String username;
     String email;

    //List<Media> purchaseMediaList = new ArrayList<>() ;

    private List<Media> shoppingCart = new ArrayList<>() ;
    private List<Media> purchasedMediaList = new ArrayList<>();


    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email= email;
    }
    public void setShoppingCartt(List <Media> shoppingCart){
        this.shoppingCart= shoppingCart;
    }
    public void setPurchasedMediaList(List <Media> purchasedMediaList){
        this.purchasedMediaList= purchasedMediaList;
    }
    public List<Media> getShoppingCart(){
        return shoppingCart;
    }

    public List<Media> getPurchasedMediaList(){
        return purchasedMediaList;
    }

    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }


    //Additional methods

    public void addToCart(Media media){

          shoppingCart.add(media);
    }

    public void removeFromCart(Media media){

        shoppingCart.remove(media);

    }

    public void checkOut(){
        if(!shoppingCart.isEmpty()){
            for (Media media : shoppingCart)
            purchasedMediaList.add(media);
            System.out.println("checkout done successfully");
        }else
            System.out.println("Your shopping cart empty!");
    }

    }








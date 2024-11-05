package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {


    private List<User> user = new ArrayList<>();

    private List<Media> media1 = new ArrayList<>() ;


    //Additional methods

    public void addUser(User user) {

        this.user.add(user);

    }

    public void displayUser() {
        for (User user : user)
            System.out.println(user.getUsername());

    }


    public void addMedia(Media media) {

        media1.add(media);

    }

    public void displayMedias() {

        for (Media m : media1) {
            System.out.println(m);
        }
    }


    public Book SearchBook(String title) {

        for (Media m : media1) {
            if (m.getTitle().equalsIgnoreCase(title) && m instanceof Book) {
                return (Book) m;
            }
        }
        return null;
    }


    }  //End class
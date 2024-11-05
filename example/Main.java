package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Media m1 = new Media();
        Media media = new Media("Home", "Ahmed", "22-00", 33.0);

        Review review = new Review("Omar", 4.2, "Very interesting book");
        Review review2 = new Review("Huda", 5.0, "A useful and valuable book");
        Store store = new Store();

        User u1 = new User("Fahad", "ff@gmail.com");


          store.addUser(u1);
//        store.addUser(u2);

        System.out.println("******************");

        System.out.println("[..Welcome to our online store..]");
        System.out.println("******************");

        Book book1 = new Book(128, "Computer Science", "Andrew S.", "2238-902", 122.8);
        Book book2 = new Book(67, "The Story of Success", "Malcom G.", "8928-111", 122.8);

        Movie movie1 = new Movie(122, "Mystery Night","Director: Jane Smith", "221-00", 20000);
        Movie movie2 = new Movie(90, "Comedy Gold","Director: Jane Smith", "286-20", 11000);

        Music music1 = new Music("Layan Ahmed", "Hope", "Munir F.", "54-000", 123000);
        Music music2 = new Music("Sara Jamal", "Shine Bright", "Ahmed N.", "17-202", 7000);
        Music music3 = new Music("Omar Yusuf", "Ocean Wave", "Malik", "20-676", 4390);
        Music music4 = new Music("Lina Salem", "Dreams", "Munir F.", "11-037", 1400);

        Novel novel1 = new Novel("Classic", "The Great Gatsby", " F. Scott Fitzgerald", "23-888", 144, 10);

        AcademicBook academicBook1 = new AcademicBook("Philosophy of Science","The Structure of Scientific Revolutions","Thomas S. Kuhn", "3707-11", 200,166 );

        u1.checkOut();  //Before add any media to the cart

        System.out.println("---------------------------------------");

        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(novel1);
        store.addMedia(academicBook1);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(music1);

        System.out.println("All medias avilable in the store (Books, movies, and musics) :");
        store.displayMedias();

        System.out.println("---------------------------------------");

        //First, user add to his cart then checkout
        u1.addToCart(book1);
        u1.addToCart(book2);
        u1.addToCart(music1);
        u1.addToCart(movie1);
        u1.addToCart(movie2);

        System.out.println("Your shopping cart now contains: ");
        for (Media media1 : u1.getShoppingCart()) {
            System.out.println(media1.getTitle() );
        }
        System.out.println();




        //
        u1.removeFromCart(movie2);

        System.out.println("Your shopping cart after remove " + movie2.getTitle() + " movie: ");
        for (Media media1 : u1.getShoppingCart()) {
            System.out.println(media1.getTitle() );
        }
        System.out.println("~~~~~~~~~~~~~~~~");

        System.out.println("Number of " + book1.getTitle() + " book in stock now: " + book1.getStock() + " book");

        //user1 purchase book 1(comp sc)
        book1.purchase(u1);

        System.out.println("Number of " + book1.getTitle() + " book in stock (after user purchasing): " + book1.getStock()+ " book");


        System.out.println("~~~~~~~~~~~~~~~~");        // u1.addToCart(movie2);
        u1.checkOut();

        System.out.println("---------------------------------------");

        //user add a review
        book1.addReview(review);
        book2.addReview(review2);

        System.out.println("Books Average:- ");

        System.out.println("The avg rating for Computer Science book: " + book1.getAverageRating());
        System.out.println("The avg rating for The Story of Success book: " + book2.getAverageRating() + "\n");

        System.out.println("What is type of Computer Science book? " + book1.getMediaType());
        System.out.println("What is type of The Story of Success book? " + book2.getMediaType() + "\n");

        System.out.println("The " + book1.getTitle() + (book1.isBestSeller() ? " best seller book" : " not from best seller book"));


        //Restock book with quantity of 100
        book2.restock(100);
        System.out.println();

        System.out.println("Search for Python Basics book: ");

        Book search = store.SearchBook("Python Basics");

        if(!(search == null)){
            System.out.println("The book is avilable/found");
        }else
            System.out.println("The book is not avilable/found");

        System.out.println("---------------------------------------");

        List<Movie> movieCat = new ArrayList<>();
        movieCat.add(movie2);

        System.out.println("Recommendation for similar movies to " + movie1.getTitle() + " movie:");
        System.out.println(movie1.recommendSimilarMovies(movieCat));

        System.out.println("Type of Comedy Gold movie: " + movie1.getMediaType());

        System.out.println("---------------------------------------");


        List<Music> musicCatalog = new ArrayList<>();

        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music3);
        musicCatalog.add(music4);

        List<Music> generalPlayList = music1.generalPlayList(musicCatalog);

        System.out.println("The playlist with same auteur: ");
        System.out.println(generalPlayList);

        System.out.println("The type of " + music1.getTitle() + ": " + music1.getMediaType());

        System.out.println("---------------------------------------");












    }
}
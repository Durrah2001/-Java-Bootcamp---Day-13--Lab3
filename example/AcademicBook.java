package org.example;

public class AcademicBook extends Book{

    private String subject;

    public AcademicBook( String subject, String title, String auteur, String ISBN, double price, int stock) {
        super(stock, title, auteur, ISBN, price);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


        @Override
    public String getMediaType() {
        return super.getAverageRating() >= 4.5 ? "Bestselling AcademicBook" : "AcademicBook";
    }

    @Override
    public String toString() {
        return super.toString() + " Subject: " + subject;
    }









}








    //Additional methods




package com.example.jenny.prog2;

public class Book {
    private String name;
    private String description;

    public static final Book[] books = {

            new Book("The Hunger Games",
                    "12- to 18-year-olds fight to the death in a reality show"),
            new Book("Twilight",
                    "A girl and a vampire fall in love"),
            new Book("Harry Potter",
                    "A boy finds out he's a wizard"),
            new Book("The Great Gatsby",
                    "Man gets rich off bootlegging to impress married woman"),
            new Book("Pride and Prejudice",
            "Guy with too much pride falls for girl with too much prejudice")
    };

    //Each Book has a name and description
    private Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
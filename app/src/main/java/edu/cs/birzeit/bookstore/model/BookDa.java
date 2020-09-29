package edu.cs.birzeit.bookstore.model;

import java.util.ArrayList;
import java.util.List;

 class BookDa implements IBookDa {

    private ArrayList<Book> books = new ArrayList<>();

    public BookDa(){
        books.add(new Book(300, "Thinking in Java",
                "Java"));
        books.add(new Book(450, "Professional Java",
                "Java"));
        books.add(new Book(500, "Beginning C# Development",
                "C#"));

    }

    public List<Book> getBooks(String cat){

        ArrayList<Book> data = new ArrayList<>();
        for(Book b : books){
            if(b.getCategory().equals(cat)){
                data.add(b);
            }
        }
        return data;
    }

}

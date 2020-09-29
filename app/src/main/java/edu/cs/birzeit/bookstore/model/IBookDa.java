package edu.cs.birzeit.bookstore.model;

import java.util.List;

public interface IBookDa {

    List<Book> getBooks(String cat);

}

package edu.cs.birzeit.bookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.bookstore.model.Book;

import edu.cs.birzeit.bookstore.model.BookFactory;
import edu.cs.birzeit.bookstore.model.IBookDa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGetBooksOnClick(View view) {

        BookFactory factory = new BookFactory();
        IBookDa objBook = factory.getModel();

        List<Book> books = objBook.getBooks("Java");

        String str = "";
        for(Book b:books){
            str+=b.getTitle() + "\n";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

    }
}

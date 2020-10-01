package edu.cs.birzeit.bookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.bookstore.model.Book;

import edu.cs.birzeit.bookstore.model.BookFactory;
import edu.cs.birzeit.bookstore.model.IBookDa;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        BookFactory factory = new BookFactory();
        IBookDa objBook = factory.getModel();

        String[] cats = objBook.getCategories();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cats);

        spinner.setAdapter(adapter);



    }

    public void btnGetBooksOnClick(View view) {

        BookFactory factory = new BookFactory();
        IBookDa objBook = factory.getModel();

        String item  = "";

        item = spinner.getSelectedItem().toString();

        List<Book> books = objBook.getBooks(item);

        String str = "";
        for(Book b:books){
            str+=b.getTitle() + "\n";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

    }
}

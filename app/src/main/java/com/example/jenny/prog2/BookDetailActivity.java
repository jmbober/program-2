package com.example.jenny.prog2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BookDetailActivity extends AppCompatActivity {
    public static final String EXTRA_BOOK_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        BookDetailFragment frag = (BookDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int bookId = (int) getIntent().getExtras().get(EXTRA_BOOK_ID);
        frag.setBookId(bookId);
    }
}
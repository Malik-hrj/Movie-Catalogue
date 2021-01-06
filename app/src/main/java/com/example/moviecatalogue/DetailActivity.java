package com.example.moviecatalogue;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public TextView MovieNames, textD;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_movie);

        imageView = findViewById (R.id.img_item_photo);
        textD = findViewById(R.id.tv_item_detail);
        MovieNames = findViewById(R.id.MovieName);

        Movie objek = getIntent().getParcelableExtra("objek");
        imageView = findViewById(R.id.img_item_photo);
        assert objek != null;
        imageView.setImageResource(objek.getPhoto());
        textD.setText(objek.getDescription());
        MovieNames.setText(objek.getName());

    }
}

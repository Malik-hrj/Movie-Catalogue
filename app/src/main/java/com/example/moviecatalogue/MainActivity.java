package com.example.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter adapter;
    private String[] dataName;
    private String[] dataDescriptions;
    private TypedArray dataPhoto;
    private ArrayList<Movie> movies;
    private RecyclerView lv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv_list);
        adapter = new MovieAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        additem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this,DetailActivity.class));
            }
        });
    }

    private void showRecyclerList() {
        lv_list.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(movies);
        lv_list.setAdapter(listMovieAdapter);
    }

    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescriptions = getResources().getStringArray(R.array.data_descriptions);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }


    private void setMovies(int selectedMovies) {
        switch (selectedMovies) {
            case R.id.lv_list:
                Intent intent = new Intent(MainActivity.this, ContactsContract.Profile.class);
                startActivity(intent);
                break;
        }
    }

    private void additem() {
        movies = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Movie movie = new Movie();
            movie.setPhoto((dataPhoto.getResourceId(i, -1)));
            movie.setName(dataName[i]);
            movie.setDescription(dataDescriptions[i]);
            movies.add(movie);
        }
        adapter.setMovies(movies);
    }
}

package com.cssoft.moviedatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.cssoft.moviedatabase.adapters.MyMoviesAdapter;
import com.cssoft.moviedatabase.movies.Movies;
import com.cssoft.moviedatabase.retrofit.MainRetrofit;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{


    @BindView(R.id.gridView)
    GridView gridViewMovies;

    Movies movies=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainRetrofit obj=new MainRetrofit();
        obj.getMovesFromServer(this);

    }

    public void loadData(Movies data)
    {
        movies=data;
        MyMoviesAdapter adapter=new MyMoviesAdapter(this,movies);
        gridViewMovies.setAdapter(adapter);

    }



}

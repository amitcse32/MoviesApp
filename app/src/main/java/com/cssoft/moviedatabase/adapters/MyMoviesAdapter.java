package com.cssoft.moviedatabase.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.cssoft.moviedatabase.R;
import com.cssoft.moviedatabase.movies.Movies;
import com.squareup.picasso.Picasso;

public class MyMoviesAdapter extends BaseAdapter {

    Context ctx;
    Movies movies;

    public MyMoviesAdapter(Context context, Movies data)
    {
        ctx=context;
        movies=data;
    }

    @Override
    public int getCount() {
        return movies.results.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(ctx);
        View view=inflater.inflate(R.layout.movie_layout,null);
        ImageView imageView=view.findViewById(R.id.imageViewPoster);

        System.out.println("http://image.tmdb.org/t/p/w185/"+movies.results.get(position).posterPath);

        Picasso.with(ctx).load("http://image.tmdb.org/t/p/w185/"+movies.results.get(position).posterPath).into(imageView);

        return view;


    }
}

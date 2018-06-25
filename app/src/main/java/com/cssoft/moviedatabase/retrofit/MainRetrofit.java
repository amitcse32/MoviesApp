package com.cssoft.moviedatabase.retrofit;

import com.cssoft.moviedatabase.MainActivity;
import com.cssoft.moviedatabase.MyInterface;
import com.cssoft.moviedatabase.movies.Movies;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainRetrofit {

    public void showMessage(final MyInterface myInterface)
    {




        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.themoviedb.org").addConverterFactory(GsonConverterFactory.create()).build();
        Call<Movies> dataRequest=retrofit.create(RetrofitInterface.class).getLatestMovies();
        dataRequest.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {
                Movies movies=new Movies();
                movies=response.body();
                myInterface.loadMovies(movies);
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {

            }
        });






    }

}

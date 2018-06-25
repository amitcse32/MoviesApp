package com.cssoft.moviedatabase.retrofit;

import com.cssoft.moviedatabase.movies.Movies;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("3/movie/now_playing?api_key=da46474f8dd8ea1caebd07b84cb98b86&language=en-US&page=1")
    Call<Movies> getLatestMovies();




}

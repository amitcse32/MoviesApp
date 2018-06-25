package com.cssoft.moviedatabase.movies;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{
	public String overview;
	public String originalLanguage;
	public String originalTitle;
	public boolean video;
	public String title;
	public List<Integer> genreIds;
	public String posterPath;
	public String backdropPath;
	public String releaseDate;
	public double voteAverage;
	public double popularity;
	public int id;
	public boolean adult;
	public int voteCount;
}
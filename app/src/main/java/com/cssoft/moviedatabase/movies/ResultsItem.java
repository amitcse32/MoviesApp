package com.cssoft.moviedatabase.movies;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem {

	@SerializedName("overview")
	public String overview;

	@SerializedName("original_language")
	public String originalLanguage;

	@SerializedName("original_title")
	public String originalTitle;

	@SerializedName("video")
	public boolean video;

	@SerializedName("title")
	public String title;

	@SerializedName("genre_ids")
	public List<Integer> genreIds;

	@SerializedName("poster_path")
	public String posterPath;

	@SerializedName("backdrop_path")
	public String backdropPath;

	@SerializedName("release_date")
	public String releaseDate;

	@SerializedName("vote_average")
	public double voteAverage;

	@SerializedName("popularity")
	public double popularity;

	@SerializedName("id")
	public int id;

	@SerializedName("adult")
	public boolean adult;

	@SerializedName("vote_count")
	public int voteCount;
}
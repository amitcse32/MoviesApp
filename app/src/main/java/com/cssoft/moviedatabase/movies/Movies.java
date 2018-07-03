package com.cssoft.moviedatabase.movies;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Movies{

	@SerializedName("dates")
	public Dates dates;

	@SerializedName("page")
	public int page;

	@SerializedName("total_pages")
	public int totalPages;

	@SerializedName("results")
	public List<ResultsItem> results;

	@SerializedName("total_results")
	public int totalResults;
}
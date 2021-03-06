package com.adrianarroyoceja.amazonviewer.dao;

import java.util.ArrayList;
import com.adrianarroyoceja.amazonviewer.model.Movie;

public interface MovieDAO {

	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default ArrayList<Movie> read() {
		ArrayList<Movie> movies = new ArrayList();
		return movies;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
	
}

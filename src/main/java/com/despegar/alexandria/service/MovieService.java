package com.despegar.alexandria.service;

import com.despegar.alexandria.connector.exception.APIException;
import com.despegar.alexandria.connector.tmdb.TMDBConnector;
import com.despegar.alexandria.connector.tmdb.dto.MovieCreditsDTO;
import com.despegar.alexandria.connector.tmdb.dto.MovieDetailDTO;
import com.despegar.alexandria.connector.tmdb.dto.ReviewResultsDTO;
import com.despegar.alexandria.connector.tmdb.dto.SimilarMovieResultsDTO;
import com.despegar.alexandria.model.Movie;
import com.despegar.alexandria.model.MovieReview;
import com.despegar.alexandria.transformer.MovieTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private TMDBConnector tmdbConnector;
    private MovieTransformer movieTransformer;

    @Autowired
    public MovieService(TMDBConnector tmdbConnector, MovieTransformer movieTransformer) {
        this.tmdbConnector = tmdbConnector;
        this.movieTransformer = movieTransformer;
    }

    public Optional<Movie> get(String id) {
        try{
            Optional<MovieDetailDTO> movieDetail = tmdbConnector.getMovie(id);
            Optional<ReviewResultsDTO> reviews = tmdbConnector.getReviews(id);
            Optional<SimilarMovieResultsDTO> similarMovies = tmdbConnector.getSimilarMovies(id);
            Optional<MovieCreditsDTO> credits = tmdbConnector.getCastAndCrew(id);

            return movieTransformer.transform(movieDetail, reviews, similarMovies, credits);
        }
        catch (APIException exception){
            return Optional.empty();
        }
    }
}

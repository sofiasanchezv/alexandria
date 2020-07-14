package com.despegar.alexandria.connector.tmdb;

import com.despegar.alexandria.config.TMDBConfig;
import com.despegar.alexandria.connector.tmdb.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class TMDBConnector {
    private static final String MOVIE_PATH = "/3/movie/{id}?api_key={token}&language=en-US";
    private static final String REVIEWS_PATH = "/3/movie/{id}/reviews?api_key={token}";
    private static final String SIMILAR_MOVIES_PATH = "/3/movie/{id}/similar?api_key={token}";
    private static final String CREDITS_PATH = "/3/movie/{id}/credits?api_key={token}";
    private static final String MOVIE_SEARCH_URL = "/3/search/movie?api_key={token}&query={query}&page={page}";
    private RestTemplate client;
    private String token;

    @Autowired
    public TMDBConnector(RestTemplate tmdbClient, TMDBConfig config){
        this.client = tmdbClient;
        this.token = config.getToken();
    }

    public Optional<MovieDetailDTO> getMovie(String id){
        return Optional.ofNullable(client.getForObject(MOVIE_PATH, MovieDetailDTO.class, id, token));
    }

    public Optional<ReviewResultsDTO> getReviews(String id){
        return Optional.ofNullable(client.getForObject(REVIEWS_PATH, ReviewResultsDTO.class, id, token));
    }

    public Optional<SimilarMovieResultsDTO> getSimilarMovies(String id){
        return Optional.ofNullable(client.getForObject(SIMILAR_MOVIES_PATH, SimilarMovieResultsDTO.class, id, token));
    }

    public Optional<MovieCreditsDTO> getCastAndCrew(String id){
        return Optional.ofNullable(client.getForObject(CREDITS_PATH, MovieCreditsDTO.class, id, token));
    }

    public Optional<MovieSearchResultsDTO> searchMovie(String query, Integer page){
        return Optional.ofNullable(client.getForObject(MOVIE_SEARCH_URL, MovieSearchResultsDTO.class, query, page, token));
    }

}

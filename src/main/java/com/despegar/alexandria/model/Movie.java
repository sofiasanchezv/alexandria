package com.despegar.alexandria.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Movie {
    private Integer id;
    private String title;
    private String description;
    private String originalTitle;
    private String originalLanguage;
    private String releaseDate;
    private Integer revenue;
    private List<String> genres;
    private List<MovieCast> cast;
    private List<MovieCrew> crew;
    private List<MovieReview> reviews;
    private List<MovieInfo> similarMovies;

    @JsonCreator
    public Movie(
            @JsonProperty("id") Integer id,
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("original_title") String originalTitle,
            @JsonProperty("original_language") String originalLanguage,
            @JsonProperty("release_date") String releaseDate,
            @JsonProperty("revenue") Integer revenue,
            @JsonProperty("genres") List<String> genres,
            @JsonProperty("cast") List<MovieCast> cast,
            @JsonProperty("crew") List<MovieCrew> crew,
            @JsonProperty("reviews") List<MovieReview> reviews,
            @JsonProperty("similar_movies") List<MovieInfo> similarMovies) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.genres = genres;
        this.cast = cast;
        this.crew = crew;
        this.reviews = reviews;
        this.similarMovies = similarMovies;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<MovieCast> getCast() {
        return cast;
    }

    public List<MovieCrew> getCrew() {
        return crew;
    }

    public List<MovieReview> getReviews() {
        return reviews;
    }

    public List<MovieInfo> getSimilarMovies() {
        return similarMovies;
    }
}

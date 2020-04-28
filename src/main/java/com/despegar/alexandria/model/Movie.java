package com.despegar.alexandria.model;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String id;
    private String name;
    private String description;
    private String summary;
    private LocalDate releaseDate;
    private List<String> genres;
    private List<MovieCast> cast;
    private List<MovieReview> reviews;
    private List<MovieInfo> similarMovies;

    public Movie() {
    }

    public Movie(String id, String name, String description, List<String> genres) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}

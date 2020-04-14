package com.despegar.springworkshop.model.list;

import java.time.LocalDate;
import java.util.Set;

public class MovieList {
    private String id;
    private String name;
    private String user;
    private LocalDate created;
    private Set<MovieListItem> movies;

    public MovieList() {
    }

    public MovieList(String name, String user) {
        this.name = name;
        this.user = user;
        this.created = LocalDate.now();
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Set<MovieListItem> getMovies() {
        return movies;
    }

    public void setMovies(Set<MovieListItem> movies) {
        this.movies = movies;
    }
}

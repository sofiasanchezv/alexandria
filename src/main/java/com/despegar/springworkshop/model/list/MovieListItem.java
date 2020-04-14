package com.despegar.springworkshop.model.list;

import com.despegar.springworkshop.model.Movie;

import java.time.LocalDate;

public class MovieListItem {
    private Movie movie;
    private LocalDate added;

    public MovieListItem() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDate getAdded() {
        return added;
    }

    public void setAdded(LocalDate added) {
        this.added = added;
    }
}

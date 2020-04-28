package com.despegar.alexandria.service;

import com.despegar.alexandria.model.list.MovieList;
import com.despegar.alexandria.model.list.MovieListInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieListService {

    public Optional<MovieList> get(String id) {
        return Optional.of(new MovieList());
    }

    public MovieList create(MovieListInfo movieListInfo) {
        return new MovieList(movieListInfo.getName(), movieListInfo.getUser());
    }

    public Optional<MovieList> delete(String id){
        return Optional.of(new MovieList());
    }

    public Optional<MovieList> addToList(String id, List<String> movies){
        return Optional.of(new MovieList());
    }

    public Optional<MovieList> deleteFromList(String id, List<String> movies){
        return Optional.of(new MovieList());
    }
}

package com.despegar.springworkshop.controller;

import com.despegar.springworkshop.model.list.MovieList;
import com.despegar.springworkshop.model.list.MovieListInfo;
import com.despegar.springworkshop.service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class MovieListController {

    private MovieListService movieListService;

    @Autowired
    public MovieListController(MovieListService movieListService) {
        this.movieListService = movieListService;
    }

    @GetMapping(value = "/lists/{id}")
    public MovieList getList(@PathVariable(value = "id") final String id){
        return movieListService.get(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value = "/lists")
    public MovieList createList(@RequestBody MovieListInfo movieListInfo){
        return movieListService.create(movieListInfo);
    }

    @DeleteMapping (value = "/lists/{id}")
    public MovieList deleteList(@PathVariable(value = "id") final String id){
        return movieListService.delete(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value = "/lists/{id}/movies")
    public MovieList addToList(@RequestBody List<String> movies, @PathVariable(value = "id") final String id){
        return movieListService.addToList(id, movies).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping(value = "/lists/{id}/movies")
    public MovieList deleteFromList(@RequestBody List<String> movies, @PathVariable(value = "id") final String id){
        return movieListService.deleteFromList(id, movies).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}

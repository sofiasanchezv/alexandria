package com.despegar.alexandria.controller;

import com.despegar.alexandria.model.Movie;
import com.despegar.alexandria.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SearchController {
    private SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping(value = "/search")
    public List<Movie> searchMovies(@RequestParam(value = "query") String query, @RequestParam Optional<Integer> page){
        return this.searchService.search(query, page.orElse(1));
    }
}

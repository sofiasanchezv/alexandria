package com.despegar.alexandria.service;

import com.despegar.alexandria.model.Movie;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    public List<Movie> search(String query, Integer page){
        return Lists.newArrayList(new Movie());
    }
}

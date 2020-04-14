package com.despegar.springworkshop.service;

import com.despegar.springworkshop.model.Movie;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {
    public Optional<Movie> get(String id) {
        return Optional.of(new Movie());
    }
}

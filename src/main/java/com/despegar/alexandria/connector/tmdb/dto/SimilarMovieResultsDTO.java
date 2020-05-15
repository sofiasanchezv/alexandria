package com.despegar.alexandria.connector.tmdb.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SimilarMovieResultsDTO {
    List<MovieSearchDTO> results;

    @JsonCreator
    public SimilarMovieResultsDTO(
            @JsonProperty("results") List<MovieSearchDTO> results) {
        this.results = results;
    }

    public List<MovieSearchDTO> getResults() {
        return results;
    }
}

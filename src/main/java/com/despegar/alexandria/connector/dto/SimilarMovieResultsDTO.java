package com.despegar.alexandria.connector.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SimilarMovieResultsDTO {
    List<SimilarMovieDTO> results;

    @JsonCreator
    public SimilarMovieResultsDTO(
            @JsonProperty("results") List<SimilarMovieDTO> results) {
        this.results = results;
    }

    public List<SimilarMovieDTO> getResults() {
        return results;
    }
}

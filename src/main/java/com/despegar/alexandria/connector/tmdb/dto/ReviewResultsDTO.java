package com.despegar.alexandria.connector.tmdb.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReviewResultsDTO {
    private List<ReviewDTO> results;

    @JsonCreator
    public ReviewResultsDTO(
            @JsonProperty("results") List<ReviewDTO> results) {
        this.results = results;
    }

    public List<ReviewDTO> getResults() {
        return results;
    }
}

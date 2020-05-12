package com.despegar.alexandria.connector.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovieSearchResultsDTO {
    private Integer page;
    private List<MovieSearchDTO> results;

    @JsonCreator
    public MovieSearchResultsDTO(
            @JsonProperty("page") Integer page,
            @JsonProperty("results") List<MovieSearchDTO> results) {
        this.page = page;
        this.results = results;
    }

    public Integer getPage() {
        return page;
    }

    public List<MovieSearchDTO> getResults() {
        return results;
    }
}

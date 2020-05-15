package com.despegar.alexandria.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieInfo {
    private Integer id;
    private String title;
    private String releaseDate;

    @JsonCreator
    public MovieInfo(
            @JsonProperty("id") Integer id,
            @JsonProperty("title") String title,
            @JsonProperty("release_date") String releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}

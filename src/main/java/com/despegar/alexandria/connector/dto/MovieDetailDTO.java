package com.despegar.alexandria.connector.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class MovieDetailDTO {
    private Integer id;
    private String title;
    private String originalTitle;
    private String originalLanguage;
    private String overview;
    private String releaseDate;
    private Integer revenue;
    private BigDecimal voteAverage;
    private List<GenreDTO> genres;

    @JsonCreator
    public MovieDetailDTO(
            @JsonProperty("id") Integer id,
            @JsonProperty("title") String title,
            @JsonProperty("original_title") String originalTitle,
            @JsonProperty("original_language") String originalLanguage,
            @JsonProperty("overview") String overview,
            @JsonProperty("release_date") String releaseDate,
            @JsonProperty("revenue") Integer revenue,
            @JsonProperty("vote_average") BigDecimal voteAverage,
            @JsonProperty("genres") List<GenreDTO> genres) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.voteAverage = voteAverage;
        this.genres = genres;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public BigDecimal getVoteAverage() {
        return voteAverage;
    }

    public List<GenreDTO> getGenres() {
        return genres;
    }
}

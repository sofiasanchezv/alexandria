package com.despegar.alexandria.transformer;

import com.despegar.alexandria.connector.tmdb.dto.*;
import com.despegar.alexandria.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

@Component
public class MovieTransformer {

    private static final List<String> CREW_JOBS = newArrayList("director", "screenplay");

    public Optional<Movie> transform(Optional<MovieDetailDTO> movieDetail, Optional<ReviewResultsDTO> reviewResults, Optional<SimilarMovieResultsDTO> similarMovieResults, Optional<MovieCreditsDTO> credits) {

        List<String> genres = getGenres(movieDetail);
        List<MovieCast> cast = getCast(credits);
        List<MovieCrew> crew = getAndFilterCrew(credits);
        List<MovieReview> reviews = getReviews(reviewResults);
        List<MovieInfo> similarMovies = transformSimilarMovies(similarMovieResults);

        return movieDetail.map(md -> new Movie(md.getId(), md.getTitle(), md.getOverview(), md.getOriginalTitle(), md.getOriginalLanguage(), md.getReleaseDate(), md.getRevenue(), genres, cast, crew, reviews, similarMovies));
    }

    private List<String> getGenres(Optional<MovieDetailDTO> movieDetail) {
        return movieDetail.map(md -> md.getGenres().stream().map(GenreDTO::getName).collect(Collectors.toList())).orElseGet(ArrayList::new);
    }

    private List<MovieCast> getCast(Optional<MovieCreditsDTO> credits) {
        return credits.map(c -> c.getCast().stream().map(this::transform).limit(10).collect(Collectors.toList())).orElseGet(ArrayList::new);
    }

    private List<MovieCrew> getAndFilterCrew(Optional<MovieCreditsDTO> credits) {
        return credits.map(c -> c.getCrew().stream().filter(crewDTO -> CREW_JOBS.contains(crewDTO.getJob())).map(this::transform).collect(Collectors.toList())).orElseGet(ArrayList::new);
    }

    private List<MovieReview> getReviews(Optional<ReviewResultsDTO> reviewResults) {
        return reviewResults.map(r -> r.getResults().stream().map(this::transform).collect(Collectors.toList())).orElseGet(ArrayList::new);
    }

    private List<MovieInfo> transformSimilarMovies(Optional<SimilarMovieResultsDTO> similarMovieResults) {
        return similarMovieResults.map(sm -> sm.getResults().stream().map(this::transform).limit(5).collect(Collectors.toList())).orElseGet(ArrayList::new);
    }

    private MovieCast transform(CastDTO castDTO){
        return new MovieCast(castDTO.getId(), castDTO.getName(), castDTO.getCharacter(), castDTO.getProfilePath());
    }

    private MovieCrew transform(CrewDTO crewDTO){
       return new MovieCrew(crewDTO.getId(), crewDTO.getName(), crewDTO.getJob(), crewDTO.getProfilePath());
    }

    private MovieReview transform(ReviewDTO reviewDTO){
        return new MovieReview(reviewDTO.getId(), reviewDTO.getAuthor(), reviewDTO.getContent(), reviewDTO.getUrl());
    }

    private MovieInfo transform(MovieSearchDTO movieSearchDTO){
        return new MovieInfo(movieSearchDTO.getId(), movieSearchDTO.getTitle(), movieSearchDTO.getReleaseDate());
    }

}

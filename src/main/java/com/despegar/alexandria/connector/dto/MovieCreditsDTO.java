package com.despegar.alexandria.connector.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovieCreditsDTO {
    private List<CastDTO> cast;
    private List<CrewDTO> crew;

    @JsonCreator
    public MovieCreditsDTO(
            @JsonProperty("cast") List<CastDTO> cast,
            @JsonProperty("crew") List<CrewDTO> crew) {
        this.cast = cast;
        this.crew = crew;
    }

    public List<CastDTO> getCast() {
        return cast;
    }

    public List<CrewDTO> getCrew() {
        return crew;
    }
}

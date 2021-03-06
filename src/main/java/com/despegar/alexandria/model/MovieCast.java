package com.despegar.alexandria.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieCast {
    private Integer id;
    private String name;
    private String character;
    private String profilePath;

    @JsonCreator
    public MovieCast(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("character") String character,
            @JsonProperty("profile_path") String profilePath) {
        this.id = id;
        this.name = name;
        this.character = character;
        this.profilePath = profilePath;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCharacter() {
        return character;
    }

    public String getProfilePath() {
        return profilePath;
    }
}

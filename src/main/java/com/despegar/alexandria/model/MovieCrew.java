package com.despegar.alexandria.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieCrew {
    private Integer id;
    private String name;
    private String job;
    private String profilePath;

    @JsonCreator
    public MovieCrew(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("job") String job,
            @JsonProperty("profile_path") String profilePath) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.profilePath = profilePath;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getProfilePath() {
        return profilePath;
    }
}

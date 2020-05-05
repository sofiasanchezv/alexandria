package com.despegar.alexandria.connector.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewDTO {
    private String id;
    private String author;
    private String content;
    private String url;

    @JsonCreator
    public ReviewDTO(
            @JsonProperty("id") String id,
            @JsonProperty("author") String author,
            @JsonProperty("content") String content,
            @JsonProperty("url") String url) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }
}

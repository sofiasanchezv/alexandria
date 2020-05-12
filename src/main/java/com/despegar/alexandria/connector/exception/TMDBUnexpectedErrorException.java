package com.despegar.alexandria.connector.exception;

public class TMDBUnexpectedErrorException extends APIException {
    public TMDBUnexpectedErrorException(Integer code) {
        super(code, String.format("Error %s calling TMDB", code));
    }
}

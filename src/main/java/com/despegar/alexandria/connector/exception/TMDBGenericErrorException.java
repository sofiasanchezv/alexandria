package com.despegar.alexandria.connector.exception;

public class TMDBGenericErrorException extends APIException {
    public TMDBGenericErrorException(Integer code) {
        super(code, String.format("Error %s calling TMDB", code));
    }
}

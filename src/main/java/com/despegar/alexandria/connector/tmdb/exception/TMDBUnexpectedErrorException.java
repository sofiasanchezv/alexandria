package com.despegar.alexandria.connector.tmdb.exception;

import com.despegar.alexandria.connector.exception.APIException;

public class TMDBUnexpectedErrorException extends APIException {
    public TMDBUnexpectedErrorException(Integer code) {
        super(code, String.format("Error %s calling TMDB", code));
    }
}

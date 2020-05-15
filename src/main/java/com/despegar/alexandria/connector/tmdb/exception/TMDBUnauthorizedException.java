package com.despegar.alexandria.connector.tmdb.exception;

import com.despegar.alexandria.connector.exception.APIException;

public class TMDBUnauthorizedException extends APIException {
    public TMDBUnauthorizedException(String message) {
        super(401, message);
    }
}

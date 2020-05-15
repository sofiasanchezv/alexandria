package com.despegar.alexandria.connector.tmdb.exception;

import com.despegar.alexandria.connector.exception.APIException;

public class TMDBNotFoundException extends APIException {
    public TMDBNotFoundException(String message) {
        super(404, message);
    }
}

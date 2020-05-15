package com.despegar.alexandria.connector.tmdb.exception;

import com.despegar.alexandria.connector.exception.APIException;

public class TMDBBadRequestException extends APIException {
    public TMDBBadRequestException(String message) {
        super(400, message);
    }
}

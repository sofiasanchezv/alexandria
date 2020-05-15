package com.despegar.alexandria.connector.tmdb.exception;

import com.despegar.alexandria.connector.exception.APIException;

public class TMDBForbiddenException extends APIException {
    public TMDBForbiddenException(String message) {
        super(403, message);
    }
}

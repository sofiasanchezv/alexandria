package com.despegar.alexandria.connector.exception;

public class TMDBNotFoundException extends APIException {
    public TMDBNotFoundException(String message) {
        super(404, message);
    }
}

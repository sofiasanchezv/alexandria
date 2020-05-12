package com.despegar.alexandria.connector.exception;

public class TMDBUnauthorizedException extends APIException {
    public TMDBUnauthorizedException(String message) {
        super(401, message);
    }
}

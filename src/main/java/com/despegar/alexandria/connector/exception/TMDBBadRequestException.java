package com.despegar.alexandria.connector.exception;

public class TMDBBadRequestException extends APIException {
    public TMDBBadRequestException(String message) {
        super(400, message);
    }
}

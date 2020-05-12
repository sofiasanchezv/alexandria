package com.despegar.alexandria.connector.exception;

public class TMDBForbiddenException extends APIException {
    public TMDBForbiddenException(String message) {
        super(403, message);
    }
}

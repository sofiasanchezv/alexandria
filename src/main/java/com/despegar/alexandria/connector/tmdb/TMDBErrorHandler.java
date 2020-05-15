package com.despegar.alexandria.connector.tmdb;

import com.despegar.alexandria.connector.tmdb.exception.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@Component
public class TMDBErrorHandler implements ResponseErrorHandler {

    private static final String ERROR_BASE_STRING = "Error connecting to TMDB: %s";

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
       return !response.getStatusCode().is2xxSuccessful();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        switch(response.getRawStatusCode()){
            case 400:
                throw new TMDBBadRequestException(String.format(ERROR_BASE_STRING, "400 Bad Request"));
            case 401:
                throw new TMDBUnauthorizedException(String.format(ERROR_BASE_STRING, "401 Unauthorized"));
            case 403:
                throw new TMDBForbiddenException(String.format(ERROR_BASE_STRING, "403 Forbidden"));
            case 404:
                throw new TMDBNotFoundException(String.format(ERROR_BASE_STRING, "404 Not Found"));
            default:
                throw new TMDBUnexpectedErrorException(response.getRawStatusCode());
        }
    }
}

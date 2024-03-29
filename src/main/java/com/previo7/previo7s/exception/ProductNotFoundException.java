package com.previo7.previo7s.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProductNotFoundException extends ResponseStatusException {
    public ProductNotFoundException(String id) {
        super(HttpStatus.NOT_FOUND, "product with ID: " + id + " not found");
    }
}

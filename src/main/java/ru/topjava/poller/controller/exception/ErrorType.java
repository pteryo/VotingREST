package ru.topjava.poller.controller.exception;

import org.springframework.http.HttpStatus;

public enum ErrorType {
    BAD_REQUEST_ERROR("error.wrongRequest", HttpStatus.BAD_REQUEST),
    APP_ERROR("error.appError", HttpStatus.INTERNAL_SERVER_ERROR),
    DATA_NOT_FOUND("error.dataNotFound", HttpStatus.UNPROCESSABLE_ENTITY),
    DATA_ERROR("error.dataError", HttpStatus.CONFLICT),
    VALIDATION_ERROR("error.validationError", HttpStatus.UNPROCESSABLE_ENTITY);

    private final String errorCode;
    private final HttpStatus status;

    ErrorType(String errorCode, HttpStatus status) {
        this.errorCode = errorCode;
        this.status = status;
    }
}

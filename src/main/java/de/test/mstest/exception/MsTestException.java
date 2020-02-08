package de.test.mstest.exception;

import org.springframework.http.HttpStatus;

public class MsTestException extends RuntimeException {

    protected HttpStatus httpStatus;

    protected Integer errorCode;

    protected String errorMessage;
}

package de.test.mstest.exception;

//public class ApiRequestException extends RuntimeException {
//
//    public ApiRequestException(ExError message) {
//        super(message);
//    }
//
//    public ApiRequestException(String message, Throwable cause) {
//        super(message, cause);
//    }

import org.springframework.http.HttpStatus;

public class ApiRequestException extends MsTestException {

    public ApiRequestException(ExError exError) {
        this.httpStatus = HttpStatus.BAD_REQUEST;
        this.errorCode = exError.getCode();
        this.errorMessage = exError.getMessage();
    }
}

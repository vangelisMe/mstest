package de.test.mstest.exception;

public enum ExError {

    TOO_BIG_NUMBER(100, "Number is too Big"),

    TAXID_ALREADY_EXISTS(200, "Taxid already exists");

    private Integer code;

    private String message;

    ExError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}

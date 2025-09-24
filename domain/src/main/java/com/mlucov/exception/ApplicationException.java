package com.mlucov.exception;

import com.mlucov.enums.ErrorType;

public class ApplicationException extends RuntimeException{
    private final ErrorType errorType;

    public ApplicationException(ErrorType errorType) {
        super(errorType.name());
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}

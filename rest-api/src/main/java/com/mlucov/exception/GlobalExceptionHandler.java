package com.mlucov.exception;

import com.mlucov.enums.ErrorType;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private final MessageSource messageSource;

    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<Map<String, String>> handleAppException(ApplicationException ex, Locale locale) {
        String localizedMessage = messageSource.getMessage(ex.getErrorType().name(), null, locale);

        return ResponseEntity.status(mapErrorToStatus(ex.getErrorType()))
            .body(Map.of(
                "error", ex.getErrorType().name(),
                "message", localizedMessage
            ));
    }

    private HttpStatus mapErrorToStatus(ErrorType errorType) {
        return switch (errorType) {
            case NOT_FOUND -> HttpStatus.NOT_FOUND;
            case INVALID_CREDENTIALS -> HttpStatus.UNAUTHORIZED;
            case UNAUTHORIZED -> HttpStatus.FORBIDDEN;
            case BAD_REQUEST -> HttpStatus.BAD_REQUEST;
        };
    }
}

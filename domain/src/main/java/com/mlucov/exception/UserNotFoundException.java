package com.mlucov.exception;

/**
 * Custom exception to be thrown when a user is not found.
 * This class extends RuntimeException, meaning it's an unchecked exception,
 * and does not need to be explicitly caught.
 */
public class UserNotFoundException extends RuntimeException {

    /**
     * Constructs a new UserNotFoundException with no detail message.
     */
    public UserNotFoundException() {
        super();
    }

    /**
     * Constructs a new UserNotFoundException with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval by the getMessage() method).
     */
    public UserNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new UserNotFoundException with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause The cause (which is saved for later retrieval by the getCause() method).
     * (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new UserNotFoundException with the specified cause and a detail message of (cause==null ? null : cause.toString())
     * (which typically contains the class and detail message of cause).
     *
     * @param cause The cause. (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
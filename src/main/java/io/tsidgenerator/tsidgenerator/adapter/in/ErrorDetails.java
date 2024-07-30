package io.tsidgenerator.tsidgenerator.adapter.in;

import java.time.LocalDateTime;

public final class ErrorDetails {
    private final LocalDateTime timestamp;
    private final String code;
    private final String message;

    private ErrorDetails(final LocalDateTime timestamp, final String code, final String message) {
        super();
        this.timestamp = timestamp;
        this.code = code;
        this.message = message;
    }

    public static ErrorDetails from(final Exception error) {
        return new ErrorDetails(LocalDateTime.now(), error.getClass().getSimpleName(), error.getMessage());
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public String getCode() {
        return this.code;
    }

    
    public String getMessage() {
        return this.message;
    }
}

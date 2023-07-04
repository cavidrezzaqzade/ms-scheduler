package az.ingress.msscheduler.exception;

import org.springframework.http.HttpStatus;

public interface ErrorResponse {
    String getKey();
    String getMessage();
    HttpStatus getHttpStatus();
}

package az.ingress.msscheduler.exception;

import org.springframework.http.HttpStatus;

public enum ErrorsFinal implements ErrorResponse {
    DATA_NOT_FOUND( "DATA_NOT_FOUND", HttpStatus.NOT_FOUND, "bu id-li '{id}' məlumat tapılmadı"),
    INTERNAL_SERVER_ERROR( "INTERNAL_SERVER_ERROR", HttpStatus.INTERNAL_SERVER_ERROR, "daxili server xətası");

    final String key;
    final HttpStatus httpStatus;
    final String message;

    ErrorsFinal(String key, HttpStatus httpStatus, String message) {
        this.key = key;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    @Override
    public String getKey() {
        return key;
    }
    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
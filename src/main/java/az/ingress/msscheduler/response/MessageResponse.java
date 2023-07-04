package az.ingress.msscheduler.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
public class MessageResponse {

    public static ResponseEntity<?> response(String message, Object error, HttpStatus status) {
        return new ResponseEntity<>(new ResponseModelDTO<>(message, error), status);
    }

}
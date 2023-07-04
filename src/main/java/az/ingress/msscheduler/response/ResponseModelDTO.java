package az.ingress.msscheduler.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ResponseModelDTO<T> extends ResponseModel {
    private T error;

    public ResponseModelDTO(String message, T error) {
        super(message);
        this.error = error;
    }

}

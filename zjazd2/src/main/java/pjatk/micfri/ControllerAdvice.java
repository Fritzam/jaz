package pjatk.micfri;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleRuntimeException(@Value("${tresc_naszego_bledu}") String blad){
        return new ResponseEntity<>(blad, HttpStatus.BAD_REQUEST);
    }

}

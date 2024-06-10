package rentalService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.net.ConnectException;

@RestControllerAdvice
public class RentalExceptionHandler {
    @ExceptionHandler
        public ResponseEntity<String> handleHttpClientErrorException$NotFound(HttpClientErrorException.NotFound exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleHttpClientErrorException$BadRequest(HttpClientErrorException.BadRequest exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleHttpServerErrorException$InternalServerError(HttpServerErrorException.InternalServerError exception) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Bad Gateway");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleConnectException(ConnectException exception) {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("Connection has timed out");
    }

}

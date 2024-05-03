package pjatk.micfri;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class Zjazd3Controller {

    @GetMapping("/exceptionTest")
    public ResponseEntity<Exception> exceptionResponseEntity() {
        throw new RuntimeException();
    }
}

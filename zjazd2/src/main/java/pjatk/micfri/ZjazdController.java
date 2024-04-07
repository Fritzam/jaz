package pjatk.micfri;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class ZjazdController {

    @GetMapping("/greeting")
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Hello, I am alive in webserver! :)");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car(""));
    }

    @GetMapping("/hello/{value}")
    public ResponseEntity<String> response(@PathVariable("value") String value) {
        return ResponseEntity.ok(value);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> paramResponse(@RequestParam String name) {
        return ResponseEntity.ok("Twoje imie to: " + name);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}

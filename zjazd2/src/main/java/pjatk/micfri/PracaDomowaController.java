package pjatk.micfri;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class PracaDomowaController {

    @GetMapping("/sklep/pojazdy/{pojazd}/")
    public ResponseEntity<Car> getPath() {
        return ResponseEntity.ok(new Car);
    }
}

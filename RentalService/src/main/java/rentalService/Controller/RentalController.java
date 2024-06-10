package rentalService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import rentalService.Classes.Movie;
import rentalService.Service.RentalService;

@RestController
public class RentalController {

    private final RentalService rentalService;

    RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/getMovie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable long id) {
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/returnMovie/{name}")
    public ResponseEntity<Void> returnMovie(@PathVariable String name) {
        rentalService.returnMovie(name);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/rentMovie/{name}")
    public ResponseEntity<Void> rentMovie(@PathVariable String name) {
        return ResponseEntity.status(rentalService.rentMovie(name)).build();

    }

}

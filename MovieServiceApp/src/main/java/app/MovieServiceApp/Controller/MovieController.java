package app.MovieServiceApp.Controller;

import app.MovieServiceApp.Classes.Movie;
import app.MovieServiceApp.Service.MovieService;
import app.MovieServiceApp.Service.Validator;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;
    private final Validator validator;
    MovieController(MovieService movieService, Validator validator) {
        this.movieService = movieService;
        this.validator = validator;
    }

    /*@GetMapping("/Movies")
    public ResponseEntity<List<Movie>> getMovieList() {
        return ResponseEntity.ok(movieService.getMovies());
    }*/

    @GetMapping("/Movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @PostMapping("/Movies")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/Movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable int id) {
        movieService.updateMovie(id, movie);
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @DeleteMapping("/Movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/Movies/setAvailable/{name}")
    public ResponseEntity<Void> updateAvailability(@PathVariable String name) {
        return movieService.changeAvailableStatus(name);
    }

    @PutMapping("/Movies/setUnavailable/{name}")
    public ResponseEntity<Void> rentMovie(@PathVariable String name) {
        return movieService.setMovieUnavailable(name);
    }


}

package app.MovieServiceApp.Controller;

import app.MovieServiceApp.Classes.Movie;
import app.MovieServiceApp.Service.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;
    MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/Movies")
    public ResponseEntity<List<Movie>> getMovieList() {
        return ResponseEntity.ok(movieService.getMovies());
    }

    @GetMapping("/Movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        if (movieService.getMovie(id) != null) {
            return ResponseEntity.ok(movieService.getMovie(id));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PostMapping("/Movies")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        try {
            movieService.addMovie(movie);
            return ResponseEntity.ok(movie);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(movie);
        }
    }

    @PutMapping("/Movies")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {

    }
}

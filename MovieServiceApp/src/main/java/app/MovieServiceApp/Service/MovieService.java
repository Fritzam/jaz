package app.MovieServiceApp.Service;

import app.MovieServiceApp.Classes.Movie;
import app.MovieServiceApp.Storage.MovieRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie getMovie(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public void updateMovie(int id, Movie movie) {
        if (movieRepository.findById(id).isPresent()) {
            movieRepository.save(movie);
        }
    }
    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    public ResponseEntity<Void> setMovieUnavailable(String name) {
        if (movieRepository.findMovieByName(name).isPresent()) {
            movieRepository.rentMovie(name);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Void> changeAvailableStatus(String name) {
        if (movieRepository.findMovieByName(name).isPresent()) {
            movieRepository.updateAvailabilityByName(name);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}


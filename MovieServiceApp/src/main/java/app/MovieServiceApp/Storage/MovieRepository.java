package app.MovieServiceApp.Storage;

import app.MovieServiceApp.Classes.Movie;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Transactional
    @Modifying
    void updateAvailabilityByName(String name);

    @Transactional
    @Modifying
    @Query(name = "deleteByID")
    void deleteByID(int id);

    @Query(name = "findById")
    Movie findById(int id);

    //public Movie getMovie(int id) {
    //        return movieRepository.findById(id).orElse(null);
    //    }public void addMovie(Movie movie) {
    //        movieRepository.save(movie);
    //    }public void updateMovie(int id, Movie movie) {
    //        if (movieRepository.findById(id).isPresent()) {
    //            movieRepository.save(movie);
    //        }
    //    }
    //
    //
    //

}

package app.MovieServiceApp.Storage;

import app.MovieServiceApp.Classes.Movie;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Transactional
    @Modifying
    void updateAvailabilityByName(String name);

    @Override
    Optional<Movie> findById(Integer integer);

    @Transactional
    @Modifying
    @Query("update Movie set is_available = false where name= ?1")
    void rentMovie(String name);
    Optional<Movie> findMovieByName(String name);

}

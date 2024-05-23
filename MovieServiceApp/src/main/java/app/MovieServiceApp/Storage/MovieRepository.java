package app.MovieServiceApp.Storage;

import app.MovieServiceApp.Classes.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, int> {
}

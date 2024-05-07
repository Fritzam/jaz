package app.MovieServiceApp.Service;

import app.MovieServiceApp.Classes.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    List<Movie> movies = new ArrayList<>();

    MovieService() {
        movies.add(new Movie( "Pila", "Horror"));
        movies.add(new Movie( "Equilibrium", "Sci-Fi"));
    }


    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {

        movies.add(movie);
    }

    public Movie getMovie(int ID) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getID() == ID) {
                return movies.get(i);
            }
        }
        return null;
    }
}

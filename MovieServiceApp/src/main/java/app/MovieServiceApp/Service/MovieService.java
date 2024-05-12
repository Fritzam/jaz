package app.MovieServiceApp.Service;

import app.MovieServiceApp.Classes.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
        if (movie.getName() == null || movie.getCategory() == null) {
            throw new IllegalArgumentException("No fields can be null.");
        }
        for (int i = 0; i < movies.size(); i++) {
            if (movie.getName().equals(movies.get(i).getName())) {
                throw new IllegalArgumentException("Movie with such name already exists.");
            }
        }
        movies.add(movie);
    }

    public Movie getMovie(int ID) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getID() == ID) {
                return movies.get(i);
            }
        }
        throw new NoSuchElementException("Movie with ID: " + ID + " doesn't exist in our database.");
    }

    public void updateMovie(Movie movie, int ID) {
        boolean movieFound = false;
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getID() == ID) {
                movies.get(i).setName(movie.getName());
                movies.get(i).setCategory(movie.getCategory());
                movieFound = true;
            }
        }
        if (!movieFound) {
            throw new NoSuchElementException("Movie with ID: " + ID + " doesn't exist in our database.");
        }
    }

    public void deleteMovie(int ID) {
        boolean movieFound = false;
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getID() == ID) {
                movies.remove(i);
                movieFound = true;
            }
        }
        if (!movieFound) {
            throw new NoSuchElementException("Movie with ID: " + ID + " doesn't exist in our database.");
        }
    }
}


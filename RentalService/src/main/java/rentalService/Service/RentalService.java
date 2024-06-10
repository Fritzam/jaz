package rentalService.Service;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import rentalService.Classes.Movie;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Movie getMovie(long id) {
        return restTemplate.getForEntity("http://localhost:8080/Movies/" + id, Movie.class).getBody();
    }

    public void returnMovie(String string) {
        restTemplate.exchange("http://localhost:8080/Movies/setAvailable/" + string, HttpMethod.PUT, null ,Void.class);
    }

    public HttpStatusCode rentMovie(String name) {
        return restTemplate.exchange("http://localhost:8080/Movies/setUnavailable/" + name, HttpMethod.PUT, null, Void.class).getStatusCode();
    }
}

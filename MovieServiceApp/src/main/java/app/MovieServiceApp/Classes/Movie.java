package app.MovieServiceApp.Classes;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ID;
    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private Categories category;

    @Column
    private double Score;

    @Column
    private boolean is_available;

    public boolean isAvailable() {
        return is_available;
    }

    public void setAvailable(boolean available) {
        is_available = available;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public Movie() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

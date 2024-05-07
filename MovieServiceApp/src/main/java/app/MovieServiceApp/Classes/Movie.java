package app.MovieServiceApp.Classes;

import org.springframework.stereotype.Component;

public class Movie {
    private static int nextID = 1;
    private int ID;
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.ID = nextID++;
        this.name = name;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

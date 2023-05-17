package io.codelex.classesandobjects.practice.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static List<Movie> getPG(Movie[] movies) {
        List<Movie> pgMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                pgMovies.add(movie);
            }
        }

        return pgMovies;
    }

    public String getRating() {
        return rating;
    }
}

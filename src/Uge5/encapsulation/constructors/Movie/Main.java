package Uge5.encapsulation.constructors.Movie;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();

        movie.setTitle("Fast & The Furious");
        movie.setDirector("Bob Jackson");
        movie.setDuration(208);

        System.out.println(movie.getMovieDetails());
    }
}
import java.util.ArrayList;

public class Movie {
    String movieTitle;
    String genre;
    float duration;
    double rating;

    int index = 0;

    static ArrayList<Movie> movieList = new ArrayList<>();

    public Movie(String movieTitle, String genre, float duration, double rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;

        movieList.add(index, this);
        index++;
    }

    public void displayMovieDetails() {
        System.out.println("\nMovie Title: " + movieTitle);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating + "/10");
    }

    public static void viewAllMovieTitles() {
        System.out.println("\nList of All Movies:");
        for (Movie movie : movieList) {
            System.out.println(" - " + movie.movieTitle);
        }
    }
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148, 8.8);
        Movie movie2 = new Movie("Interstellar", "Sci-Fi", 169, 8.6);
        Movie movie3 = new Movie("The Dark Knight", "Action", 152, 9.0);
        Movie movie4 = new Movie("Titanic", "Romance", 195, 7.8);

        movie1.displayMovieDetails();

        Movie.viewAllMovieTitles();
    }
}

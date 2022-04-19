package movies;

public class MoviesApplication {




    public static void outputMenu(){
        System.out.println("What would you like to do?\n" + "\n" +

        "0 - exit\n" +
"        1 - view all movies\n" +
"        2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category\n");
    }

    public static void printMoviesByCategory(Movie[] movies, String category){
        for (Movie movie : movies){
            if (movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " --" + movie.getCategory());
            }
        }
    }

    public static void printAllMovies(Movie[] movies){
        for (Movie movie : movies){
            System.out.println();
        }
    }
}

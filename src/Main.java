public class Main {

    public static void main(String[] args) {
        Movie avatar = new Adventure("Avatar");
        Movie weddingCrashers = new Commedy("Wedding Crashers");
        Movie starWar = new SciFi("Star Wars");

        Movie testingMovie = Movie.getMovie("Adventure", "Indiana Jones");

        testingMovie.watchMovie();

//        avatar.watchMovie();
//        weddingCrashers.watchMovie();
//        starWar.watchMovie();
    }
}
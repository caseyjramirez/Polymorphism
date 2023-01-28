public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();

        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {

        return switch (type.toLowerCase().charAt(0)) {
            case 'a' -> new Adventure(title);
            case 'c' -> new Commedy(title);
            case 's' -> new SciFi(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {


    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad happens"
        );
    }
}

class Commedy extends Movie {


    public Commedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny",
                "Funnier",
                "Happy Ending"
        );
    }
}

class SciFi extends Movie {


    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Space",
                "Aliens",
                "Space Guys"
        );
    }
}
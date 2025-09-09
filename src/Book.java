public class Book {
    static int staticId = 0;
    int id;
    int releaseYear;
    String name;
    String author;

    Book(int releaseYear, String name, String author) {
        this.id = staticId;
        staticId++;
        this.releaseYear = releaseYear;
        this.name = name;
        this.author = author;
    }

    Book(int releaseYear, String name) {
        this.id = staticId;
        staticId++;
        this.releaseYear = releaseYear;
        this.name = name;
    }

    Book(String name, String author) {
        this.id = staticId;
        staticId++;
        this.name = name;
        this.author = author;
    }

    Book(String name) {
        this.id = staticId;
        staticId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}

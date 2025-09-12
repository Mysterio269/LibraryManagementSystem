public class Book {
    static int staticId = 0;
    int id;
    int releaseYear;
    String name;
    String author;
    String genre;

    Book(String name, String author, int releaseYear, String genre) {
        this.id = staticId;
        staticId++;
        this.releaseYear = releaseYear;
        this.name = name;
        this.author = author;
        this.genre = genre;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return name + " (" + releaseYear + ')' + " by " + author + " - Genre: " + genre;
    }
}

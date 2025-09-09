public class Inventory {
    static int numberOfBooks = 0;
    Book[] books = new Book[0];

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[numberOfBooks + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[numberOfBooks] = book;
        books = newBooks;
        numberOfBooks++;
    }

    public void getBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println((i + 1) + "-" + books[i].getName());
        }
    }
}

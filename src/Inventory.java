import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;;

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

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String name = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter release year: ");
        int releaseYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        Book book = new Book(name, author, releaseYear, genre);
        Book[] newBooks = new Book[numberOfBooks + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[numberOfBooks] = book;
        books = newBooks;
        numberOfBooks++;
        scanner.close();
    }

    public void getBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println((i + 1) + "-" + books[i].getName());
        }
    }

    public void readBooksFromFile() {
        String filepath = "C:\\Users\\Bassant\\Desktop\\javaLearning\\LibraryManagementSystem\\src\\Storage.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String name, author, genre;
            int releaseYear;
            while ((name = reader.readLine()) != null) {
                author = reader.readLine();
                releaseYear = Integer.parseInt(reader.readLine());
                genre = reader.readLine();
                Book book = new Book(name, author, releaseYear, genre);
                addBook(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file!");
        } catch (IOException e) {
            System.out.println("something went wrong!");
        }
    }

    public void writeBooksToFile() {
        String filepath = "C:\\Users\\Bassant\\Desktop\\javaLearning\\LibraryManagementSystem\\src\\Storage.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            for (int i = 0; i < numberOfBooks; i++) {
                writer.write(books[i].getName());
                writer.newLine();
                writer.write(books[i].getAuthor());
                writer.newLine();
                writer.write(String.valueOf(books[i].getReleaseYear()));
                writer.newLine();
                writer.write(books[i].getGenre());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("something went wrong!");
        }
    }
}

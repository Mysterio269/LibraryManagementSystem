public class LibraryAPP {
    public static void main(String[] args) throws Exception {
        Book book2 = new Book("harry potter and the philosopher's stone", "j.k. rowling", 1997, "fantasy");
        Book book3 = new Book("gone with the wind");
        Book book4 = new Book("sherlock holmes");
        Inventory inventory = new Inventory();
        inventory.addBook(book2);
        inventory.addBook(book3);
        inventory.addBook(book4);
        inventory.getBooks();
        System.out.println(inventory.getNumberOfBooks());
        System.out.println(book2.toString());
    }
}

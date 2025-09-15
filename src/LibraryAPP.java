public class LibraryAPP {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.readBooksFromFile();
        System.out.println(inventory.getNumberOfBooks());
        for (int i = 0; i < inventory.getNumberOfBooks(); i++) {
            System.out.println((i + 1) + "-" + inventory.books[i].toString());
        }
        // inventory.addBook();
        System.out.println(inventory.getNumberOfBooks());
        inventory.writeBooksToFile();
    }
}

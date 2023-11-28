package developbeginner.iterator.example;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.add(new Book("Around the World in 80 Days"));
        bookShelf.add(new Book("Bible"));
        bookShelf.add(new Book("Cinderella"));
        bookShelf.add(new Book("Daddy-Long-Legs"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
        System.out.println();
    }
}

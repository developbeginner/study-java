package developbeginner.iterator.example;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int length) {
        this.books = new Book[length];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void add(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}

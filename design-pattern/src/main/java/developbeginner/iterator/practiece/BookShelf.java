package developbeginner.iterator.practiece;

import developbeginner.iterator.example.Book;
import developbeginner.iterator.example.Iterable;
import developbeginner.iterator.example.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books;
    private int last = 0;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void add(Book book) {
        books.add(book);
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

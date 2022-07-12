package com.himura.iterator;

public class BookShelf implements Aggregate{
    private Book[] bookshelf;
    private int index = 0;

    public BookShelf (int max) {
        bookshelf = new Book[max];
    }

    public void add(Book book) {
        bookshelf[index++] = book;
    }

    public int getLength() {
        return index;
    }

    public Book getIndex(int i) {
        return bookshelf[i];
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

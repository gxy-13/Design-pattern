package com.himura.iterator;

public class BookShelf implements Aggregate{
    private Book[] books;
    private int index;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public void add(Book book) {
        books[index++] = book;
    }

    public int getLength() {
        return index;
    }

    public Book getIndex(int i) {
        return books[i];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

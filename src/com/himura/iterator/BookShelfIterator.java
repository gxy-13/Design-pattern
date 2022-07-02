package com.himura.iterator;

public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int lastIndex;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public Boolean hasNext() {
        return lastIndex < bookShelf.getLength();
    }

    public Object next() {
        return bookShelf.getIndex(lastIndex++);
    }
}

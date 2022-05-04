package com.himura.iterator;



// 表示一个集合
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;

    public BookShelf(int capacity) {
        this.books = new Book[capacity];
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void addBook(Book book) {
        books[last++] = book;
    }

    public int getLength() {
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

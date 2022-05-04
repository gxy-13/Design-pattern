package com.himura.iterator;

import java.util.ArrayList;
import java.util.List;

public class NewBookShelf implements Aggregate{
    private List books ;
    private int last = 0;

    public NewBookShelf(int capacity) {
        this.books = new ArrayList<Book>(capacity);
    }
    public void addBook(Book book) {
        books.add(book);
        last++;
    }
    public int getLength(){
        return last;
    }

    public Book getBook(int index) {
        return (Book) books.get(index);
    }

    @Override
    public Iterator iterator() {
        return new NewBookShelfIterator(this);
    }
}

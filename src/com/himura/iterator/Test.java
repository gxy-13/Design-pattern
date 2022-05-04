package com.himura.iterator;

public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("Hello"));
        bookShelf.addBook(new Book("World"));
        bookShelf.addBook(new Book("Design"));
        bookShelf.addBook(new Book("Pattern"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}

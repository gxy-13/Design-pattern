package com.himura.iterator;

public class TestArrayList {
    public static void main(String[] args) {
        NewBookShelf newBookShelf = new NewBookShelf(4);
        newBookShelf.addBook(new Book("Hello"));
        newBookShelf.addBook(new Book("World"));
        newBookShelf.addBook(new Book("Design"));
        newBookShelf.addBook(new Book("Pattern"));
        newBookShelf.addBook(new Book("Java"));
        Iterator iterator = newBookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}

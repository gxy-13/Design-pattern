package com.himura.iterator;

public class NewBookShelfIterator implements Iterator{
    private NewBookShelf bookShelf;
    private int index ;

    public NewBookShelfIterator(NewBookShelf bookShelf){
          this.bookShelf = bookShelf;
          index = 0;
    }
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        } else {
            return  false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBook(index);
        index++;
        return book;
    }
}

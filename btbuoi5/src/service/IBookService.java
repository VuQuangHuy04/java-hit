package service;
import domain.Book;
import domain.Borrowable;
import domain.Novel;
import domain.TextBook;

import java.util.ArrayList;

public  interface IBookService {
    public void addBook(Book book);
    public Book getBookById(String id);
    public ArrayList<Book> getAllBookByCategory(Object category);
    public void deleteBookById(String id);
    public void getAllBooks();
    public double calculateTotalValue();
}

package ru.aston.dao;

import ru.aston.entity.Book;
import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();
    Book getBookById(long id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(long id);
}

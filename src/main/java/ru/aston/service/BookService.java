package ru.aston.service;

import ru.aston.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getAllBooks();
    BookDTO getBookById(long id);
    BookDTO addBook(BookDTO bookDTO);
    BookDTO updateBook(long id, BookDTO bookDTO);
    boolean deleteBook(long id);
}

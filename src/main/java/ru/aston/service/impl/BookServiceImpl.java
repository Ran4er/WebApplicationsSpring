package ru.aston.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aston.dto.BookDTO;
import ru.aston.entity.Book;
import ru.aston.mapper.BookMapper;
import ru.aston.repository.BookRepository;
import ru.aston.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BookDTO getBookById(long id) {
        return bookRepository.findById(id)
                .map(bookMapper::toDTO)
                .orElse(null);
    }

    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        return bookMapper.toDTO(bookRepository.save(book));
    }

    @Override
    public BookDTO updateBook(long id, BookDTO bookDTO) {
        if (bookRepository.existsById(id)) {
            Book book = bookMapper.toEntity(bookDTO);
            book.setId(id);
            return bookMapper.toDTO(bookRepository.save(book));
        }
        return null;
    }

    @Override
    public boolean deleteBook(long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

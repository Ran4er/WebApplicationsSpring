package ru.aston.dao.impl;

import ru.aston.dao.BookDAO;
import ru.aston.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> getAllBooks() {
        return entityManager.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    @Override
    public Book getBookById(long id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        entityManager.merge(book);
    }

    @Override
    @Transactional
    public void deleteBook(long id) {
        Book book = entityManager.find(Book.class, id);
        if (book != null) {
            entityManager.remove(book);
        }
    }
}

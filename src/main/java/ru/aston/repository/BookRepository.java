package ru.aston.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.aston.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

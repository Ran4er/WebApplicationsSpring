package ru.aston.WebApplication.repository;

import org.springframework.data.repository.CrudRepository;

import ru.aston.WebApplication.entity.AuthorEntity;

public interface AuthorRepo extends CrudRepository<AuthorEntity, Long> {
    
    AuthorEntity findByAuthorName(String name);

}

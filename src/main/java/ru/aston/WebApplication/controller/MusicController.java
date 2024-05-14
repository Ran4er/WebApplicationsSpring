package ru.aston.WebApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class MusicController {
    
    public static final String ERROR = "Произошла ошибка!";

    private AuthorService AuthorService;

    public ResponseEntity getAuthors() {
        
    }

}

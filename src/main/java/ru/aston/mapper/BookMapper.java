package ru.aston.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ru.aston.dto.BookDTO;
import ru.aston.entity.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(source = "orders", target="orders")
    BookDTO toDTO(Book book);

    @Mapping(source = "orders", target = "orders")
    Book toEntity(BookDTO bookDTO);
}

package com.qrn.pruebaTecnicaQaroni.books.infrastructure;

import com.qrn.pruebaTecnicaQaroni.CycleAvoidingMappingContext;
import com.qrn.pruebaTecnicaQaroni.books.domain.Book;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookEntity toBookEntity(Book book,@Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
    Book toBook(BookEntity bookEntity,@Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
    List<Book> toBookList(List<BookEntity> bookEntityList,@Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
}

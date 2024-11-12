package com.qrn.pruebaTecnicaQaroni.authors.infrastructure;

import com.qrn.pruebaTecnicaQaroni.CycleAvoidingMappingContext;
import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.books.infrastructure.BookMapper;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorEntity toAuthorEntity(Author author,@Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
    Author toAuthor(AuthorEntity authorEntity,@Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
    List<Author> toAuthorList(List<AuthorEntity> authorEntityList,@Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
}

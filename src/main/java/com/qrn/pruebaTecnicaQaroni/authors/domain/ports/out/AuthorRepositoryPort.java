package com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepositoryPort {
   Author save(Author author);
   Optional<Author> findById(Long id);
   List<Author> findAll();
   Optional<Author> update(Author author);
   Optional<Long> deleteById(Long id);

}

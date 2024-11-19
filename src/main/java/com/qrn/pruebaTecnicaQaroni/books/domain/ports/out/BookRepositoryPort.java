package com.qrn.pruebaTecnicaQaroni.books.domain.ports.out;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.books.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepositoryPort {
    Book save(Book book);
    Optional<Book> findById(Long id);
    List<Book> findAll();
    Optional<Book> update(Book book);
    Optional<Long> deleteById(Long id);
}

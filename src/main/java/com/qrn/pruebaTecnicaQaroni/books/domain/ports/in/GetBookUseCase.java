package com.qrn.pruebaTecnicaQaroni.books.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.books.domain.Book;

import java.util.List;
import java.util.Optional;

public interface GetBookUseCase {
    Optional<Book> getBook(Long id);
    List<Book> getAllBooks();
}

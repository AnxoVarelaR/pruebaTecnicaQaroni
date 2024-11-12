package com.qrn.pruebaTecnicaQaroni.books.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.books.domain.Book;

import java.util.Optional;

public interface UpdateBookUseCase {
    Optional<Book> updateBook(Book book);
}

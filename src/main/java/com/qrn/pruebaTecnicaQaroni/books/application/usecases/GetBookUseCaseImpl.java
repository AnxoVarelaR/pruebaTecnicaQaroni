package com.qrn.pruebaTecnicaQaroni.books.application.usecases;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.books.domain.Book;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.GetBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.out.BookRepositoryPort;

import java.util.List;
import java.util.Optional;

public class GetBookUseCaseImpl implements GetBookUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    public GetBookUseCaseImpl(BookRepositoryPort bookRepositoryPort) {
        this.bookRepositoryPort = bookRepositoryPort;
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return bookRepositoryPort.findById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepositoryPort.findAll();
    }
}

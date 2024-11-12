package com.qrn.pruebaTecnicaQaroni.books.application.usecases;

import com.qrn.pruebaTecnicaQaroni.books.domain.Book;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.CreateBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.out.BookRepositoryPort;

public class CreateBookUseCaseImpl implements CreateBookUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    public CreateBookUseCaseImpl(BookRepositoryPort bookRepositoryPort) {
        this.bookRepositoryPort = bookRepositoryPort;
    }


    @Override
    public Book createBook(Book book) {
        return bookRepositoryPort.save(book);
    }
}

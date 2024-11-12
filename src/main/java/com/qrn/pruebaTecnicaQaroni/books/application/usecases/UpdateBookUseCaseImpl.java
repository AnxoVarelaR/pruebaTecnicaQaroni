package com.qrn.pruebaTecnicaQaroni.books.application.usecases;

import com.qrn.pruebaTecnicaQaroni.books.domain.Book;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.UpdateBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.out.BookRepositoryPort;

import java.util.Optional;

public class UpdateBookUseCaseImpl implements UpdateBookUseCase {
    private final BookRepositoryPort bookRepositoryPort;

    public  UpdateBookUseCaseImpl(BookRepositoryPort bookRepositoryPort){
        this.bookRepositoryPort = bookRepositoryPort;
    }

    @Override
    public Optional<Book> updateBook(Book book) {
        return bookRepositoryPort.update(book);
    }
}

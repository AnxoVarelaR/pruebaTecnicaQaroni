package com.qrn.pruebaTecnicaQaroni.books.application.usecases;


import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.DeleteBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.out.BookRepositoryPort;

import java.util.Optional;

public class DeleteBookUseCaseImpl implements DeleteBookUseCase {

    private final BookRepositoryPort bookRepositoryPort;

    public DeleteBookUseCaseImpl(BookRepositoryPort bookRepositoryPort) {
        this.bookRepositoryPort = bookRepositoryPort;
    }

    @Override
    public Optional<Long> deleteBook(Long id) {
        return bookRepositoryPort.deleteById(id);
    }
}

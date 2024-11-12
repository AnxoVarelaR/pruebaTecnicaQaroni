package com.qrn.pruebaTecnicaQaroni.authors.application.usecases;

import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.DeleteAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out.AuthorRepositoryPort;

import java.util.Optional;

public class DeleteAuthorUseCaseImpl implements DeleteAuthorUseCase {

    private final AuthorRepositoryPort authorRepositoryPort;

    public DeleteAuthorUseCaseImpl(AuthorRepositoryPort authorRepositoryPort) {
        this.authorRepositoryPort = authorRepositoryPort;
    }

    @Override
    public Optional<Long> deleteAuthor(Long id) {
        return authorRepositoryPort.deleteById(id);
    }
}

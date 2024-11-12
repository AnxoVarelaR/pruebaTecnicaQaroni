package com.qrn.pruebaTecnicaQaroni.authors.application.usecases;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.UpdateAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out.AuthorRepositoryPort;

import java.util.Optional;

public class UpdateAuthorUseCaseImpl implements UpdateAuthorUseCase {

    private final AuthorRepositoryPort authorRepositoryPort;

    public UpdateAuthorUseCaseImpl(AuthorRepositoryPort authorRepositoryPort) {
        this.authorRepositoryPort = authorRepositoryPort;
    }

    @Override
    public Optional<Author> updateAuthor(Author author) {
        return authorRepositoryPort.update(author);
    }
}

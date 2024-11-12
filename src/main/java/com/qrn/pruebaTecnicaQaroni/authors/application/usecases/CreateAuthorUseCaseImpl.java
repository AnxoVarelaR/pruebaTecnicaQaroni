package com.qrn.pruebaTecnicaQaroni.authors.application.usecases;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.CreateAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out.AuthorRepositoryPort;

public class CreateAuthorUseCaseImpl implements CreateAuthorUseCase {

    private final AuthorRepositoryPort authorRepositoryPort;

    public CreateAuthorUseCaseImpl(AuthorRepositoryPort authorRepositoryPort) {
        this.authorRepositoryPort = authorRepositoryPort;
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepositoryPort.save(author);
    }
}

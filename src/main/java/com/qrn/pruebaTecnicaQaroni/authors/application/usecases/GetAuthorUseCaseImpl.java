package com.qrn.pruebaTecnicaQaroni.authors.application.usecases;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.GetAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out.AuthorRepositoryPort;

import java.util.List;
import java.util.Optional;

public class GetAuthorUseCaseImpl implements GetAuthorUseCase {

    private final AuthorRepositoryPort authorRepositoryPort;

    public GetAuthorUseCaseImpl(AuthorRepositoryPort authorRepositoryPort) {
        this.authorRepositoryPort = authorRepositoryPort;
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        return authorRepositoryPort.findById(id);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepositoryPort.findAll();
    }
}

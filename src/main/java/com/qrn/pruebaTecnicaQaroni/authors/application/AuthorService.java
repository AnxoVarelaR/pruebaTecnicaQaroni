package com.qrn.pruebaTecnicaQaroni.authors.application;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.CreateAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.DeleteAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.GetAuthorUseCase;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in.UpdateAuthorUseCase;

import java.util.List;
import java.util.Optional;

public class AuthorService implements CreateAuthorUseCase, DeleteAuthorUseCase, GetAuthorUseCase, UpdateAuthorUseCase {
    private final CreateAuthorUseCase createAuthorUseCase;
    private final DeleteAuthorUseCase deleteAuthorUseCase;
    private final GetAuthorUseCase getAuthorUseCase;
    private final UpdateAuthorUseCase updateAuthorUseCase;

    public AuthorService(CreateAuthorUseCase createAuthorUseCase,
                         DeleteAuthorUseCase deleteAuthorUseCase,
                         GetAuthorUseCase getAuthorUseCase,
                         UpdateAuthorUseCase updateAuthorUseCase) {
        this.createAuthorUseCase = createAuthorUseCase;
        this.deleteAuthorUseCase = deleteAuthorUseCase;
        this.getAuthorUseCase = getAuthorUseCase;
        this.updateAuthorUseCase = updateAuthorUseCase;
    }

    @Override
    public Author createAuthor(Author author) {
        return createAuthorUseCase.createAuthor(author);
    }

    @Override
    public Optional<Long> deleteAuthor(Long id) {
        return deleteAuthorUseCase.deleteAuthor(id);
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        return getAuthorUseCase.getAuthor(id);
    }

    @Override
    public List<Author> getAllAuthors() {
        return getAuthorUseCase.getAllAuthors();
    }

    @Override
    public Optional<Author> updateAuthor(Author author) {
        return updateAuthorUseCase.updateAuthor(author);
    }
}

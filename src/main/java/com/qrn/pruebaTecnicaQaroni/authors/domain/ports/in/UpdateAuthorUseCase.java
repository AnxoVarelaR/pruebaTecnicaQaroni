package com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;

import java.util.Optional;

public interface UpdateAuthorUseCase {
    Optional<Author> updateAuthor(Author author);
}

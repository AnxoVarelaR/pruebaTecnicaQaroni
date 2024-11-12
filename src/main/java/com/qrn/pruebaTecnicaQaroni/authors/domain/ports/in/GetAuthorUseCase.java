package com.qrn.pruebaTecnicaQaroni.authors.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;

import java.util.List;
import java.util.Optional;

public interface GetAuthorUseCase {
    Optional<Author> getAuthor(Long id);
    List<Author> getAllAuthors();
}

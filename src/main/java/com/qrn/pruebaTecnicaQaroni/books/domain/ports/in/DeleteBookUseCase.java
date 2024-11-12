package com.qrn.pruebaTecnicaQaroni.books.domain.ports.in;

import java.util.Optional;

public interface DeleteBookUseCase {
    Optional<Long> deleteBook(Long id);
}

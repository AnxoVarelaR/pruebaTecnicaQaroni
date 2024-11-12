package com.qrn.pruebaTecnicaQaroni.books.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.books.domain.Book;

public interface CreateBookUseCase {

    Book createBook(Book book);

}

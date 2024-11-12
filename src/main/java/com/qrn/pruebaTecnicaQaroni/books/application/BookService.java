package com.qrn.pruebaTecnicaQaroni.books.application;

import com.qrn.pruebaTecnicaQaroni.authors.application.AuthorService;
import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;
import com.qrn.pruebaTecnicaQaroni.books.domain.Book;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.CreateBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.DeleteBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.GetBookUseCase;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.in.UpdateBookUseCase;

import java.util.List;
import java.util.Optional;

public class BookService implements CreateBookUseCase, DeleteBookUseCase, GetBookUseCase, UpdateBookUseCase {

    private final CreateBookUseCase createBookUseCase;
    private final DeleteBookUseCase deleteBookUseCase;
    private final GetBookUseCase getBookUseCase;
    private final UpdateBookUseCase updateBookUseCase;

    public BookService(CreateBookUseCase createBookUseCase,
                       DeleteBookUseCase deleteBookUseCase,
                       GetBookUseCase getBookUseCase,
                       UpdateBookUseCase updateBookUseCase) {
        this.createBookUseCase = createBookUseCase;
        this.deleteBookUseCase = deleteBookUseCase;
        this.getBookUseCase = getBookUseCase;
        this.updateBookUseCase = updateBookUseCase;
    }

    @Override
    public Book createBook(Book book) {
        return createBookUseCase.createBook(book);
    }

    @Override
    public Optional<Long> deleteBook(Long id) {
        return deleteBookUseCase.deleteBook(id);
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return getBookUseCase.getBook(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return getBookUseCase.getAllBooks();
    }

    @Override
    public Optional<Book> updateBook(Book book) {
        return updateBookUseCase.updateBook(book);
    }
}

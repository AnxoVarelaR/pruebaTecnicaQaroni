package com.qrn.pruebaTecnicaQaroni.books.infrastructure;

import com.qrn.pruebaTecnicaQaroni.books.application.BookService;
import com.qrn.pruebaTecnicaQaroni.books.application.usecases.CreateBookUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.books.application.usecases.DeleteBookUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.books.application.usecases.GetBookUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.books.application.usecases.UpdateBookUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.books.domain.ports.out.BookRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookService bookService(BookRepositoryPort bookRepositoryPort) {
        return new BookService(
                new CreateBookUseCaseImpl(bookRepositoryPort),
                new DeleteBookUseCaseImpl(bookRepositoryPort),
                new GetBookUseCaseImpl(bookRepositoryPort),
                new UpdateBookUseCaseImpl(bookRepositoryPort)
        );
    }

}

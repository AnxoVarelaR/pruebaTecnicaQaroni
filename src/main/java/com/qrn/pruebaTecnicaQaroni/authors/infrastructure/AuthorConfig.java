package com.qrn.pruebaTecnicaQaroni.authors.infrastructure;

import com.qrn.pruebaTecnicaQaroni.authors.application.AuthorService;
import com.qrn.pruebaTecnicaQaroni.authors.application.usecases.CreateAuthorUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.authors.application.usecases.DeleteAuthorUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.authors.application.usecases.GetAuthorUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.authors.application.usecases.UpdateAuthorUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.authors.domain.ports.out.AuthorRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {

    @Bean
    public AuthorService authorService(AuthorRepositoryPort authorRepositoryPort) {
        return new AuthorService(
                new CreateAuthorUseCaseImpl(authorRepositoryPort),
                new DeleteAuthorUseCaseImpl(authorRepositoryPort),
                new GetAuthorUseCaseImpl(authorRepositoryPort),
                new UpdateAuthorUseCaseImpl(authorRepositoryPort)
        );
    }
}

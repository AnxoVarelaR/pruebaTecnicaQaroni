package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import com.qrn.pruebaTecnicaQaroni.users.application.UserService;
import com.qrn.pruebaTecnicaQaroni.users.application.usecases.GenerateJwtCaseImpl;
import com.qrn.pruebaTecnicaQaroni.users.application.usecases.GetUserUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.users.application.usecases.LoginUserUseCaseImpl;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.out.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(
                new GetUserUseCaseImpl(userRepositoryPort),
                new LoginUserUseCaseImpl(userRepositoryPort),
                new GenerateJwtCaseImpl(userRepositoryPort)

        );
    }
}

package com.qrn.pruebaTecnicaQaroni.users.application;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;
import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.GetUserUseCase;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.LoginUserUseCase;

import java.util.Optional;

public class UserService implements GetUserUseCase, LoginUserUseCase {

    private final GetUserUseCase getUserUseCase;
    private final LoginUserUseCase loginUserUseCase;

    public UserService(GetUserUseCase getUserUseCase, LoginUserUseCase loginUserUseCase) {
        this.getUserUseCase = getUserUseCase;
        this.loginUserUseCase = loginUserUseCase;
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return getUserUseCase.getUserByUsername(username);
    }

    @Override
    public AuthResponse login(AuthRequest authRequest) {
        return null;
    }
}

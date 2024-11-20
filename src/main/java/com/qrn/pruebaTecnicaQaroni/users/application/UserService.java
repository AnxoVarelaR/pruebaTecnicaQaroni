package com.qrn.pruebaTecnicaQaroni.users.application;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.GenerateJwtUseCase;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.GetUserUseCase;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.LoginUserUseCase;
import com.qrn.pruebaTecnicaQaroni.users.infrastructure.UserEntity;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class UserService implements GetUserUseCase, LoginUserUseCase, GenerateJwtUseCase {

    private final GetUserUseCase getUserUseCase;
    private final LoginUserUseCase loginUserUseCase;
    private final GenerateJwtUseCase generateJwtUseCase;

    public UserService(GetUserUseCase getUserUseCase, LoginUserUseCase loginUserUseCase, GenerateJwtUseCase generateJwtUseCase) {
        this.getUserUseCase = getUserUseCase;
        this.loginUserUseCase = loginUserUseCase;
        this.generateJwtUseCase = generateJwtUseCase;

    }

    @Override
    public Optional<UserEntity> getUserByUsername(String username) {
        return getUserUseCase.getUserByUsername(username);
    }

    @Override
    public AuthResponse login(AuthRequest authRequest) {
        return null;
    }

    @Override
    public String generateToken(UserEntity user, Map<String, Object> extraClaims) {
        return generateJwtUseCase.generateToken(user,extraClaims);
    }
}

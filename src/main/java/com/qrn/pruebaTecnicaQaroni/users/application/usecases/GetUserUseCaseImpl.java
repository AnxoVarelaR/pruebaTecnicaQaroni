package com.qrn.pruebaTecnicaQaroni.users.application.usecases;

import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.GetUserUseCase;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.out.UserRepositoryPort;
import com.qrn.pruebaTecnicaQaroni.users.infrastructure.UserEntity;

import java.util.Optional;

public class GetUserUseCaseImpl implements GetUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public GetUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<UserEntity> getUserByUsername(String username) {
        return userRepositoryPort.findByUsername(username);
    }
}

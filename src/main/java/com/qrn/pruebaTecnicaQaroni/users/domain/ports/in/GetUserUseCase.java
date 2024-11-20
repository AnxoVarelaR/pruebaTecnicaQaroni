package com.qrn.pruebaTecnicaQaroni.users.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import com.qrn.pruebaTecnicaQaroni.users.infrastructure.UserEntity;

import java.util.Optional;

public interface GetUserUseCase {
    Optional<UserEntity>getUserByUsername(String username);
}

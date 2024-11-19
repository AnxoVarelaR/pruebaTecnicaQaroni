package com.qrn.pruebaTecnicaQaroni.users.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.users.domain.User;

import java.util.Optional;

public interface GetUserUseCase {
    Optional<User>getUserByUsername(String username);
}

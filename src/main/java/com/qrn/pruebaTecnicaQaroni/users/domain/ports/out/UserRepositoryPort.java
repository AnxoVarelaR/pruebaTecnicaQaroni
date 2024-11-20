package com.qrn.pruebaTecnicaQaroni.users.domain.ports.out;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;
import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import com.qrn.pruebaTecnicaQaroni.users.infrastructure.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;
import java.util.Optional;

public interface UserRepositoryPort {
    Optional<UserEntity> findByUsername(String username);
    AuthResponse login(AuthRequest authRequest);
}

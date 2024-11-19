package com.qrn.pruebaTecnicaQaroni.users.domain.ports.out;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;
import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepositoryPort {
    Optional<User> findByUsername(String username);
    AuthResponse login(AuthRequest authRequest);
}

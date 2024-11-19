package com.qrn.pruebaTecnicaQaroni.users.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;

public interface LoginUserUseCase {
    AuthResponse login(AuthRequest authRequest);
}

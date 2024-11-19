package com.qrn.pruebaTecnicaQaroni.users.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.users.domain.User;

import java.util.Map;
import java.util.Objects;

public interface GenerateJwtUseCase {
    String generateToken(User user, Map<String, Objects> extraClaims);
}

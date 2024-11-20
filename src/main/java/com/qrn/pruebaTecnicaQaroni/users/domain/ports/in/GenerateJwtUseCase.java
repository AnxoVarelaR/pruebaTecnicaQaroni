package com.qrn.pruebaTecnicaQaroni.users.domain.ports.in;

import com.qrn.pruebaTecnicaQaroni.users.infrastructure.UserEntity;

import java.util.Map;

public interface GenerateJwtUseCase {
    String generateToken(UserEntity user, Map<String, Object> extraClaims);
}

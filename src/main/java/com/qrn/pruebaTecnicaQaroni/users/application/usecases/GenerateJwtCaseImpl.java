package com.qrn.pruebaTecnicaQaroni.users.application.usecases;

import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.GenerateJwtUseCase;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class GenerateJwtCaseImpl implements GenerateJwtUseCase {

    @Value("${security.jwt.expiration-minutes}")
    private long EXPIRATION_MINUTES;
    @Value("${security.jwt.secret_key}")
    private String SECRET_KEY;

    @Override
    public String generateToken(User user, Map<String, Objects> extraClaims) {
        Date createTokenDate = new Date(System.currentTimeMillis());
        Date expirationTokenDate = new Date(createTokenDate.getTime() + (EXPIRATION_MINUTES * 60 * 1000));

        return Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(user.getUsr_email())
                .setIssuedAt(expirationTokenDate)
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE)
                .signWith(generateKey(), SignatureAlgorithm.HS256)
                .compact();
    }
    private Key generateKey(){
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }
}

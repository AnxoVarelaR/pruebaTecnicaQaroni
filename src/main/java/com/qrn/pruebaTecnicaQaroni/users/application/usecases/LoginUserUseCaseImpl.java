package com.qrn.pruebaTecnicaQaroni.users.application.usecases;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.application.UserService;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;
import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.in.LoginUserUseCase;
import com.qrn.pruebaTecnicaQaroni.users.domain.ports.out.UserRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.Map;

public class LoginUserUseCaseImpl implements LoginUserUseCase {

    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;

    private final UserRepositoryPort userRepositoryPort;

    public LoginUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public AuthResponse login(AuthRequest authRequest) {
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
          authRequest.getEmail(), authRequest.getPassword()
        );
        authenticationManager.authenticate(authToken);

        User user = userService.getUserByUsername(authRequest.getEmail()).get();
        String jwt = userService.generateToken(user, generateExtraClaims(user));
        return new AuthResponse(jwt);
    }

    private Map<String, Object> generateExtraClaims(User user) {
    }
}

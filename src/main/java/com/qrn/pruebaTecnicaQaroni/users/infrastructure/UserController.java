package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import com.qrn.pruebaTecnicaQaroni.users.AuthRequest;
import com.qrn.pruebaTecnicaQaroni.users.application.UserService;
import com.qrn.pruebaTecnicaQaroni.users.domain.AuthResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/library/auth")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public EntityResponse<AuthResponse> login(@RequestBody AuthRequest authRequest){
        AuthResponse jwtResponse = userService.login(authRequest);
        return null;
    }
}

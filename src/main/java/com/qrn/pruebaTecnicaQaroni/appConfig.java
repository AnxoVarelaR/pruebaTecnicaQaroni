package com.qrn.pruebaTecnicaQaroni;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class appConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Opcional: Desactiva CSRF para simplificar en desarrollo
                .authorizeRequests()
                .anyRequest().permitAll();  // Permite todas las peticiones sin autenticación

        return http.build();
    }
}

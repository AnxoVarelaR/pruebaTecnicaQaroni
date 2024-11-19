package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import com.qrn.pruebaTecnicaQaroni.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
    @Query("SELECT u FROM UserEntity u WHERE u.usr_email = :email")
    User findByUsername(@Param("email") String usr_email);
}

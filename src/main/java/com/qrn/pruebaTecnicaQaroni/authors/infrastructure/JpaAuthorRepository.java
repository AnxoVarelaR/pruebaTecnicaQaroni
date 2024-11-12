package com.qrn.pruebaTecnicaQaroni.authors.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAuthorRepository extends JpaRepository<AuthorEntity, Long> {
}

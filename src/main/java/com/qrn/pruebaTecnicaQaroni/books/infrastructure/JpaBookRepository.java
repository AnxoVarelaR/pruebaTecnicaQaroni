package com.qrn.pruebaTecnicaQaroni.books.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface JpaBookRepository extends JpaRepository<BookEntity, Long> {
}

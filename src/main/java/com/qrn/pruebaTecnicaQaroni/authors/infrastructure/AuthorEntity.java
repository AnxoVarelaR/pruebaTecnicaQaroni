package com.qrn.pruebaTecnicaQaroni.authors.infrastructure;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qrn.pruebaTecnicaQaroni.books.infrastructure.BookEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auth_id;
    private String auth_name;
    @ManyToMany(
            mappedBy = "bk_authors",
            fetch = FetchType.LAZY
    )
    private List<BookEntity> auth_books = new ArrayList<>();
    public AuthorEntity() {
    }
    public AuthorEntity(long auth_id, String auth_name) {
        this.auth_id = auth_id;
        this.auth_name = auth_name;
    }

    public long getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(long auth_id) {
        this.auth_id = auth_id;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name;
    }

    public List<BookEntity> getAuth_books() {
        return auth_books;
    }

    public void setAuth_books(List<BookEntity> auth_books) {
        this.auth_books = auth_books;
    }
}

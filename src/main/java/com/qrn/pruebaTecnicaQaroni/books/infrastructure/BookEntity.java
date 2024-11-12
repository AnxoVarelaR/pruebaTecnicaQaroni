package com.qrn.pruebaTecnicaQaroni.books.infrastructure;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.qrn.pruebaTecnicaQaroni.authors.infrastructure.AuthorEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bk_id;
    private String bk_name;
    @ManyToMany
    @JoinTable(
            name = "authors_books",
            joinColumns = @JoinColumn(name = "bk_id"),
            inverseJoinColumns = @JoinColumn(name = "auth_id")
    )
    private List<AuthorEntity> bk_authors = new ArrayList<>();

    public BookEntity() {
    }

    public BookEntity(long bk_id, String bk_name) {
        this.bk_id = bk_id;
        this.bk_name = bk_name;
    }

    public long getBk_id() {
        return bk_id;
    }

    public void setBk_id(long bk_id) {
        this.bk_id = bk_id;
    }

    public String getBk_name() {
        return bk_name;
    }

    public void setBk_name(String bk_name) {
        this.bk_name = bk_name;
    }

    public List<AuthorEntity> getBk_authors() {
        return bk_authors;
    }

    public void setBk_authors(List<AuthorEntity> bk_authors) {
        this.bk_authors = bk_authors;
    }
}

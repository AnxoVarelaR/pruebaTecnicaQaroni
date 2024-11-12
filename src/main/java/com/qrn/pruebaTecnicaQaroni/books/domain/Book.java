package com.qrn.pruebaTecnicaQaroni.books.domain;

import com.qrn.pruebaTecnicaQaroni.authors.domain.Author;

import java.util.List;

public class Book {

    private Long bk_id;
    private String bk_name;
    private List<Author> bk_authors;

    public Book(long bk_id, String bk_name, List<Author> bk_authors) {
        this.bk_id = bk_id;
        this.bk_name = bk_name;
        this.bk_authors = bk_authors;
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

    public List<Author> getBk_authors() {
        return bk_authors;
    }

    public void setBk_authors(List<Author> bk_authors) {
        this.bk_authors = bk_authors;
    }
}

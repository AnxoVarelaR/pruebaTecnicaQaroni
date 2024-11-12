package com.qrn.pruebaTecnicaQaroni.authors.domain;

import com.qrn.pruebaTecnicaQaroni.books.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private Long auth_id;
    private String auth_name;

    public Author(long auth_id, String auth_name) {
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

}

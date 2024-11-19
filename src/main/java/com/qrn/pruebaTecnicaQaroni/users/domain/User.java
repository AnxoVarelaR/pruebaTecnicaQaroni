package com.qrn.pruebaTecnicaQaroni.users.domain;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class User {

    private Long usr_id;
    private String usr_name;
    private String usr_surname;
    private String usr_password;
    private String usr_email;
    private List<GrantedAuthority> usr_authorities;

    public User(long usr_id, String usr_name, String usr_surname, String usr_password, String usr_email) {
        this.usr_id = usr_id;
        this.usr_name = usr_name;
        this.usr_surname = usr_surname;
        this.usr_password = usr_password;
        this.usr_email = usr_email;
    }

    public long getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(long usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_surname() {
        return usr_surname;
    }

    public void setUsr_surname(String usr_surname) {
        this.usr_surname = usr_surname;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public String getUsr_email() {
        return usr_email;
    }

    public void setUsr_email(String usr_email) {
        this.usr_email = usr_email;
    }

    public List<GrantedAuthority> getUsr_authorities() {
        return usr_authorities;
    }

    public void setUsr_authorities(List<GrantedAuthority> usr_authorities) {
        this.usr_authorities = usr_authorities;
    }
}

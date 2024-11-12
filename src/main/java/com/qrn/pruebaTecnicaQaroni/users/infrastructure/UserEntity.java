package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usr_id;
    private String usr_name;
    private String usr_surname;
    private String usr_password;
    private String usr_email;
    private int rol_id;

    public UserEntity() {
    }

    public UserEntity(long usr_id, String usr_name, String usr_surname, String usr_password, String usr_email, int rol_id) {
        this.usr_id = usr_id;
        this.usr_name = usr_name;
        this.usr_surname = usr_surname;
        this.usr_password = usr_password;
        this.usr_email = usr_email;
        this.rol_id = rol_id;
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

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
}

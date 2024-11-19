package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rol_id;
    private String rol_name;
    @ManyToMany(
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "roles_permissions",
            joinColumns = @JoinColumn(name = "rol_id"),
            inverseJoinColumns = @JoinColumn(name = "perm_id")
    )
    private List<PermissionEntity> rol_permissions = new ArrayList<>();

    public RoleEntity() {
    }

    public RoleEntity(Long rol_id, String rol_name) {
        this.rol_id = rol_id;
        this.rol_name = rol_name;
    }

    public Long getRol_id() {
        return rol_id;
    }

    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }

    public String getRol_name() {
        return rol_name;
    }

    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }

    public List<PermissionEntity> getRol_permissions() {
        return rol_permissions;
    }

    public void setRol_permissions(List<PermissionEntity> rol_permissions) {
        this.rol_permissions = rol_permissions;
    }
}

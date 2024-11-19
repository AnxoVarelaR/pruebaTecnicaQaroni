package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "permissions")
public class PermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long perm_id;
    private String perm_name;
    @ManyToMany(
            fetch = FetchType.EAGER,
            mappedBy = "rol_permissions"
    )
    List<RoleEntity> perm_roles;

    public PermissionEntity() {
    }

    public PermissionEntity(Long perm_id, String perm_name) {
        this.perm_id = perm_id;
        this.perm_name = perm_name;
    }

    public Long getPerm_id() {
        return perm_id;
    }

    public void setPerm_id(Long perm_id) {
        this.perm_id = perm_id;
    }

    public String getPerm_name() {
        return perm_name;
    }

    public void setPerm_name(String perm_name) {
        this.perm_name = perm_name;
    }
}

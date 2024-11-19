package com.qrn.pruebaTecnicaQaroni.users.infrastructure;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
public class UserEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usr_id;
    private String usr_name;
    private String usr_surname;
    private String usr_password;
    private String usr_email;
    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "usr_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    private List<RoleEntity> usr_roles = new ArrayList<>();

    public UserEntity() {
    }

    public UserEntity(long usr_id, String usr_name, String usr_surname, String usr_password, String usr_email) {
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

    public List<RoleEntity> getUsr_roles() {
        return usr_roles;
    }

    public void setUsr_roles(List<RoleEntity> usr_roles) {
        this.usr_roles = usr_roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = usr_roles.stream().flatMap(
                roleEntity -> roleEntity.getRol_permissions().stream().map(
                     permissionEntity -> new SimpleGrantedAuthority(permissionEntity.getPerm_name())
                )
        ).collect(Collectors.toList());
        for(RoleEntity roleEntity : usr_roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + roleEntity.getRol_name()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.usr_password;
    }

    @Override
    public String getUsername() {
        return this.usr_email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}

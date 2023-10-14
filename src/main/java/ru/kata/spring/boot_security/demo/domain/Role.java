package ru.kata.spring.boot_security.demo.domain;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {


    public Role(String roleName){
        this.roleName = roleName;
    }

    private String roleName;

    @Override
    public String getAuthority() {
        return roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

package com.example.communicationsystem.entity.users;

import com.example.communicationsystem.entity.roles.RoleCompany;
import com.example.communicationsystem.entity.template.Template;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Emloyees extends Template implements UserDetails {


    @ManyToMany
    private Set<RoleCompany> rolesCompany;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return rolesCompany;
    }
}

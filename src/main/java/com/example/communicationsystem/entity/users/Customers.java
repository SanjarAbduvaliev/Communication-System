package com.example.communicationsystem.entity.users;

import com.example.communicationsystem.entity.SimCard;
import com.example.communicationsystem.entity.roles.RoleUser;
import com.example.communicationsystem.entity.template.Template;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class User extends Template implements UserDetails {

    @ManyToMany
    private Set<RoleUser> roleUser;

    @OneToMany
    private Set<SimCard> simCards;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roleUser;
    }
}

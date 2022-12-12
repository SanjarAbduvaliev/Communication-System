package com.example.communicationsystem.entity.roles;

import com.example.communicationsystem.entity.enums.PersonRoleNames;
import com.example.communicationsystem.entity.enums.RoleNames;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RoleUser implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Enumerated(value = EnumType.STRING)
    private PersonRoleNames personRoleNames;



    @Override
    public String getAuthority() {
        return personRoleNames.name();
    }
}

package com.example.communicationsystem.security;

import com.example.communicationsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    EmployeeService employeeService;

    //2-qadam
    public void config(AuthenticationManagerBuilder managerBuilder) throws Exception {
        managerBuilder.userDetailsService(employeeService).passwordEncoder(encoder());
    }

    //3-qadam parol va loginni taqqoslab beradigan
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
    @Bean
    public PasswordEncoder encoder(){
        return  new BCryptPasswordEncoder();
    }

}

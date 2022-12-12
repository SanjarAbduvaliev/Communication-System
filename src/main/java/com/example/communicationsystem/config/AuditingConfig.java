package com.example.communicationsystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//qaysi branch registr qilganini o'qish
@EnableJpaAuditing
@Configuration
public class AuditingConfig {
    @Bean
    AuditorAware<Integer> auditorAware(){
        return new SecurityAuditAware();
    }
}

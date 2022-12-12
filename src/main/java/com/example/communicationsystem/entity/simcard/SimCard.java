package com.example.communicationsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SimCard {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false,unique = true)
    private String number;


    private Date expireDate;

    @CreatedDate
    private Date inActiveDate;//sim karta olingan sana

    @OneToOne
    private Tariff tariff;

    private Double balance;
}

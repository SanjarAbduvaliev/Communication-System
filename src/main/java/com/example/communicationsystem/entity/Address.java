package com.example.communicationsystem.entity;

import com.example.communicationsystem.entity.roles.RoleCustomers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tariffInfo;//tarif haqida malumot

    private Double tariffPrice;//tarifning narxi

    private Integer inNetwork;//tarmoq ichidagi daqiqalar

    private Integer outNetwork;//tarmoqdan tashqari daqiqalar

    private Float internetTraffic;//internet traffik

    private Date expireDate;//tarifni amal  qilish muddati

    private Integer sms;//tarifda smslar

    @OneToOne
    private Packages packages;

    @ManyToMany
    private Set<RoleCustomers> roleCustomers;//shaxsning rollari jismoniy/yuridik

    private boolean active;

}

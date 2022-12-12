package com.example.communicationsystem.repository;

import com.example.communicationsystem.entity.turniket.ComeEmployee;
import com.example.communicationsystem.entity.users.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComeEmployeeRepository extends JpaRepository<ComeEmployee, UUID> {
}

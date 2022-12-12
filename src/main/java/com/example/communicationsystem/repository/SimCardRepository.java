package com.example.communicationsystem.repository;

import com.example.communicationsystem.entity.users.Customers;
import com.example.communicationsystem.entity.users.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customers, UUID> {
}

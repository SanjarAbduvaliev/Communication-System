package com.example.communicationsystem.repository;

import com.example.communicationsystem.entity.Branch;
import com.example.communicationsystem.entity.users.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
}

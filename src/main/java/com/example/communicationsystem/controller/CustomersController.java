package com.example.communicationsystem.controller;

import com.example.communicationsystem.entity.users.Employees;
import com.example.communicationsystem.payload.EmployeRegDto;
import com.example.communicationsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/regester")
    public ResponseEntity<?> regesterEmployee(@RequestBody EmployeRegDto employeRegDto){
        return employeeService.employeeRegester(employeRegDto);
    }

    @GetMapping("/employeeList")
    public List<Employees> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/employeeList")
    public List<Employees> getByRole(@RequestBody EmployeRegDto employeRegDto){
        return employeeService.getByRole(employeRegDto);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<?> edit(@RequestBody EmployeRegDto employeRegDto, @PathVariable UUID id){
        return employeeService.edit(employeRegDto, id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id){
        return employeeService.delete(id);
    }
}

package com.example.services;

import com.example.entities.Client;
import com.example.entities.Employe;
import com.example.repositories.ClientRepository;
import com.example.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;

    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }
    public Employe getEmployeById(Long employeId) {
        return employeRepository.findById(employeId).orElse(null);
    }
}

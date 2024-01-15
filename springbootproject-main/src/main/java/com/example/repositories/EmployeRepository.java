package com.example.repositories;

import com.example.entities.Commande;
import com.example.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
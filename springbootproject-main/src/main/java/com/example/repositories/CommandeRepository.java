package com.example.repositories;

import com.example.entities.Client;
import com.example.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
package com.example.repositories;

import com.example.entities.Produit;
import com.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> { }
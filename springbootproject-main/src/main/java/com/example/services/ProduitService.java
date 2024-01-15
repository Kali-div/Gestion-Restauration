package com.example.services;

import com.example.entities.Produit;
import com.example.entities.User;
import com.example.repositories.ProduitRepository;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }
    public Produit getProduitById(Long produitId) {
        return produitRepository.findById(produitId).orElse(null);
    }
    public List<Produit> getAllProducts()
    {
        return produitRepository.findAll();
    }
}

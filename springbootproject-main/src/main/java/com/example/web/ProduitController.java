package com.example.web;

import com.example.entities.Produit;
import com.example.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private ProduitService produitService;
    @GetMapping("/produits")
    public List<Produit>getAllProuducts()
    {
        return produitService.getAllProducts();
    }
}

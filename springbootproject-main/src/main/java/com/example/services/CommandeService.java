package com.example.services;

import com.example.entities.Client;
import com.example.entities.Commande;
import com.example.repositories.ClientRepository;
import com.example.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }
    public Commande getCommandeById(Long commandeId) {
        return commandeRepository.findById(commandeId).orElse(null);
    }
}

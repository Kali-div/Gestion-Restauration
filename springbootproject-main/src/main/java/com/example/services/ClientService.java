package com.example.services;

import com.example.entities.Client;
import com.example.entities.User;
import com.example.repositories.ClientRepository;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
    public Client getClientById(Long clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }
}

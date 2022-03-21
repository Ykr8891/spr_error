package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientRepository {
    public ClientRepository() {
        System.out.println("ClientRepository created");
    }

    private final List<Client> allClients = new ArrayList<>();

    public List<Client> findAllClients(){
        return allClients;
    }

    public void addClient(Client client){
        allClients.add(client);
    }
}

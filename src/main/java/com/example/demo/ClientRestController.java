package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ClientRestController {
    private final ClientRepository repository;

    public ClientRestController(ClientRepository repository) {
        this.repository = repository;
        System.out.println("ClientRestController created");
    }

    @GetMapping("/client")
    public List<Client> getAllClients() {
        return repository.findAllClients();
    }
}

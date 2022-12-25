package com.wesle.clients.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesle.clients.entities.Client;
import com.wesle.clients.repositories.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public List<Client> getAll() {
        return repository.findAll();
    }

}

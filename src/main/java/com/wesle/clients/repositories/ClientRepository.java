package com.wesle.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesle.clients.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

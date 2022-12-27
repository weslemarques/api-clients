package com.wesle.clients.servicies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wesle.clients.dto.ClientDTO;
import com.wesle.clients.entities.Client;
import com.wesle.clients.repositories.ClientRepository;
import com.wesle.clients.servicies.exceptions.NotFoundException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllByPage(PageRequest pagequest) {
        Page<Client> list = repository.findAll(pagequest);
        return list.map(c -> new ClientDTO(c));
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = repository.findById(id);
        Client entity = obj.orElseThrow(() -> new NotFoundException("Not found Id"));
        return new ClientDTO(entity);
    }

}

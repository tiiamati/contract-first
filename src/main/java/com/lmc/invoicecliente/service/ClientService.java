package com.lmc.invoicecliente.service;

import com.lmc.invoicecliente.domain.Client;
import com.lmc.invoicecliente.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transaction
    public Client findClientById(Long id) {
        return clientRepository.findClientById(id);
    }
}

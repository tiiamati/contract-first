package com.lmc.invoicecliente.repository;

import com.lmc.invoicecliente.domain.Client;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface ClientRepository {
    Client findClientById(Long clientId);
}

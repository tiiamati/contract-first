package com.lmc.invoicecliente.controller;

import com.lmc.invoicecliente.mapper.ClientMapper;
import com.lmc.invoicecliente.provider.api.ClientsApi;
import com.lmc.invoicecliente.provider.presentation.representation.ClientResponseRepresentation;
import com.lmc.invoicecliente.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ClientController implements ClientsApi {

    @Autowired
    private ClientService service;

    @Override
    public ResponseEntity<ClientResponseRepresentation> findClientById(Long clientId) {
        try {
            return ResponseEntity.ok().body(
                    ClientMapper.toRepresentation(true, service.findClientById(clientId), "Sucesso ao buscar cliente"));
        } catch (Exception e) {
            System.out.println("Erro ClientController.findClientById: ".concat(e.getCause().toString()));
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    ClientMapper.toRepresentation(false, null, "Erro ao buscar cliente"));
        }
    }
}

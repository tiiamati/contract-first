package com.lmc.invoicecliente.mapper;

import com.lmc.invoicecliente.domain.Client;
import com.lmc.invoicecliente.provider.presentation.representation.ApiResponseRepresentation;
import com.lmc.invoicecliente.provider.presentation.representation.ClientRepresentation;
import com.lmc.invoicecliente.provider.presentation.representation.ClientResponseRepresentation;

public class ClientMapper {

    public static ClientResponseRepresentation toRepresentation(boolean sucesso, Client client, String message) {
        ClientResponseRepresentation responseRepresentation = new ClientResponseRepresentation();
        responseRepresentation.setClient(getClienteRepresentation(client));
        responseRepresentation.setApiResponse(getApiResponse(sucesso ? 0 : 1, message));
        return responseRepresentation;
    }

    private static ClientRepresentation getClienteRepresentation(Client client) {
        ClientRepresentation clientRepresentation = new ClientRepresentation();
        clientRepresentation.setId(client.getId());
        clientRepresentation.setName(client.getName());
        clientRepresentation.setEmail(client.getEmail());
        clientRepresentation.setActive(client.isActive());
        return clientRepresentation;
    }

    private static ApiResponseRepresentation getApiResponse(int code, String message) {
        ApiResponseRepresentation apiResponseRepresentation = new ApiResponseRepresentation();
        apiResponseRepresentation.setCode(code);
        apiResponseRepresentation.setMessage(message);
        return apiResponseRepresentation;
    }
}

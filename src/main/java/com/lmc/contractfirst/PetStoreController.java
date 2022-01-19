package com.lmc.contractfirst;

import com.lmc.contractfirst.provider.api.PetApi;
import com.lmc.contractfirst.provider.presentation.representation.PetRepresentation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetStoreController implements PetApi {

    @Override
    public ResponseEntity<Void> addPet(PetRepresentation body) {
        return ResponseEntity.ok().build();
    }
}

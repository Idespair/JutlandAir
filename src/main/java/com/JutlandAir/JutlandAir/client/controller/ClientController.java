package com.JutlandAir.JutlandAir.client.controller;

import com.JutlandAir.JutlandAir.client.dto.request.ClientRequest;
import com.JutlandAir.JutlandAir.client.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<String> createClient(@Valid @RequestBody ClientRequest clientRequest){
        clientService.createClient(clientRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User " + clientRequest.getName() + " created");
    }

    @DeleteMapping("/{id}")
    @PutMapping
    public ResponseEntity<String> deleteClient(@PathVariable String id){
        clientService.deleteUserByID(UUID.fromString(id));
        return ResponseEntity.status(HttpStatus.valueOf(200)).body("User deleted successfully");
    }
}

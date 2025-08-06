package com.JutlandAir.JutlandAir.client.controller;

import com.JutlandAir.JutlandAir.client.dto.output.ClientResponse;
import com.JutlandAir.JutlandAir.client.dto.request.ClientRequest;
import com.JutlandAir.JutlandAir.client.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<String> createClient(@Valid @RequestBody ClientRequest clientRequest){
        clientService.createClient(clientRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User " + clientRequest.getName() + " created");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable UUID id){
        boolean deleted = clientService.deleteUserByID(id);
        if (deleted) {
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }

    @GetMapping
    public ResponseEntity<Page<ClientResponse>> getClients (Pageable pageable){
        Page<ClientResponse> clients = clientService.findAll(pageable);
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/Search")
    public ResponseEntity<Page<ClientResponse>> getClientByName (@RequestParam String name, Pageable pageable){
        Page<ClientResponse> clients = clientService.findByName(name, pageable);
        return ResponseEntity.ok(clients);
    }
}

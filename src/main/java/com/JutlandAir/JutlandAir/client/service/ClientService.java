package com.JutlandAir.JutlandAir.client.service;

import com.JutlandAir.JutlandAir.client.dto.output.ClientResponse;
import com.JutlandAir.JutlandAir.client.dto.request.ClientRequest;
import com.JutlandAir.JutlandAir.client.model.Client;
import com.JutlandAir.JutlandAir.client.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Client> allClients(){
        return clientRepository.findAll();
    }

    public ClientResponse createClient(ClientRequest clientRequest) {
        Client client = new Client();
        client.setId(clientRequest.getId());
        client.setName(clientRequest.getName());
        client.setLastName(clientRequest.getLastName());
        client.setEmail(clientRequest.getEmail());
        client.setGender(clientRequest.getGender());
        client.setCountryOfBirth(clientRequest.getCountryOfBirth());
        client.setPassword(passwordEncoder.encode(clientRequest.getPassword()));
        client = clientRepository.save(client);
        return clientToDTO(client);
    }

    public ResponseEntity<String> deleteUserByID(UUID id){
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return ResponseEntity.ok("User deleted");
        }
        return ResponseEntity.ok("User not found");
    }

    private ClientResponse clientToDTO(Client client){
        return new ClientResponse(client.getId(), client.getName(), client.getLastName(),
                client.getGender(), client.getEmail(), client.getCountryOfBirth());
    }

}

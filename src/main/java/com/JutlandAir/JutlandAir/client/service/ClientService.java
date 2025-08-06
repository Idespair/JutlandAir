package com.JutlandAir.JutlandAir.client.service;

import com.JutlandAir.JutlandAir.client.dto.output.ClientResponse;
import com.JutlandAir.JutlandAir.client.dto.request.ClientRequest;
import com.JutlandAir.JutlandAir.client.model.Client;
import com.JutlandAir.JutlandAir.client.repository.IClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    private final IClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;

    public ClientService(PasswordEncoder passwordEncoder, IClientRepository clientRepository) {
        this.passwordEncoder = passwordEncoder;
        this.clientRepository = clientRepository;
    }

    public List<Client> allClients(){
        return clientRepository.findAll();
    }

    public ClientResponse createClient(ClientRequest clientRequest) {
        Client client = new Client();
        client.setName(clientRequest.getName());
        client.setLastName(clientRequest.getLastName());
        client.setEmail(clientRequest.getEmail());
        client.setGender(clientRequest.getGender());
        client.setCountryOfBirth(clientRequest.getCountryOfBirth());
        client.setPassport(clientRequest.getPassport());
        client.setPassword(passwordEncoder.encode(clientRequest.getPassword()));
        client = clientRepository.save(client);
        return clientToDTO(client);
    }

    public boolean deleteUserByID(UUID id){
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Page<ClientResponse> findAll (Pageable pageable){
        Page<Client> clients = clientRepository.findAll(pageable);
        return clients.map(this::clientToDTO);
    }

    public Page<ClientResponse> findByName(String name, Pageable pageable){
        Page<Client> clients = clientRepository.findByNameContainingIgnoreCase(name, pageable);
        return clients.map(this::clientToDTO);
    }

    private ClientResponse clientToDTO(Client client){
        return new ClientResponse(client.getId(),client.getName(), client.getLastName(),
                client.getGender(), client.getEmail(), client.getCountryOfBirth(), client.getPassport());
    }

}

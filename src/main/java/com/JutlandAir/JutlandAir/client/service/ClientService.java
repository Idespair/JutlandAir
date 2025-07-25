package com.JutlandAir.JutlandAir.client.service;

import com.JutlandAir.JutlandAir.client.dto.ClientDTO;
import com.JutlandAir.JutlandAir.client.model.Client;
import com.JutlandAir.JutlandAir.client.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private IClientRepository clientRepository;

    public List<Client> AllClients(){
        return clientRepository.findAll();
    }

    private ClientDTO clientToDTO(Client client){
        return new ClientDTO(client.getId(), client.getName(), client.getLastName(),
                client.getEmail(), client.getCountryOfBirth());
    }

}

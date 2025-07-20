package com.JutlandAir.JutlandAir.client.service;

import com.JutlandAir.JutlandAir.client.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private IClientRepository clientRepository;

}

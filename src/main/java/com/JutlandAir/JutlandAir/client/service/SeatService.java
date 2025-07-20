package com.JutlandAir.JutlandAir.client.service;

import com.JutlandAir.JutlandAir.client.repository.ISeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    private ISeatRepository seatRepository;

}

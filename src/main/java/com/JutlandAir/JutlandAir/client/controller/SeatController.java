package com.JutlandAir.JutlandAir.client.controller;

import com.JutlandAir.JutlandAir.client.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/seat")
public class SeatController {

    @Autowired
    private SeatService seatService;

}

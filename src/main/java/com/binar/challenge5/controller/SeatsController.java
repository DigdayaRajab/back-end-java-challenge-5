package com.binar.challenge5.controller;


import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.service.Interface.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatsController {

    @Autowired
    SeatsService seatsService;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public Seats addSeats(@RequestBody Seats seat){
        return seatsService.newSeats(seat);
    }

    @GetMapping(value = "getAllSeats")
    public List<Seats> getAll(){
        return seatsService.findAllSeats();
    }
}


package com.binar.challenge5.service;

import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.repositories.SeatsRepository;
import com.binar.challenge5.service.Interface.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsServiceImpl implements SeatsService {

    @Autowired
    SeatsRepository seatsRepository;

    @Override
    public Seats newSeats(Seats seat) {
        return  seatsRepository.save(seat);
    }
    @Override
    public List<Seats> findAllSeats() {
        return seatsRepository.findAll();
    }

}

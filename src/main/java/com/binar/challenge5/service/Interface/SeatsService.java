package com.binar.challenge5.service.Interface;

import com.binar.challenge5.entities.Seats;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsService {
    Seats newSeats(Seats seat);

    List<Seats> findAllSeats();
}

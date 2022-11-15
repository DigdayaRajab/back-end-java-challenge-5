package com.binar.challenge5.service.Interface;

import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.model.request.SeatStatusRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsService {
    Seats newSeats(Seats seat) throws Exception;

    List<Seats> findAllSeats();

    Seats updateSeats(Seats seat);

    Seats updateSeatsStatus(SeatStatusRequest seat) throws Exception;

    void deleteSeats(Seats seat) throws Exception;
}

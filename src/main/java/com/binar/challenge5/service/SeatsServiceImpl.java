package com.binar.challenge5.service;

import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.model.request.SeatStatusRequest;
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
    public Seats newSeats(Seats seat) throws Exception {
        Seats aSeat = seatsRepository.findSeatById(seat.getSeatId().getSeatNo(), seat.getSeatId().getStudioName());
        if (aSeat != null) {
            throw new Exception("Seat sudah tersedia");
        }

        return seatsRepository.save(seat);
    }

    @Override
    public List<Seats> findAllSeats() {
        return seatsRepository.findAll();
    }

    @Override
    public Seats updateSeats(Seats seat) {
        return seatsRepository.save(seat);
    }

    @Override
    public Seats updateSeatsStatus(SeatStatusRequest seat) throws Exception{
        Seats aSeat = seatsRepository.findSeatById(seat.getSeatNo(), seat.getStudioName());
        if (aSeat == null) {
            throw new Exception("Seat tidak tersedia");
        }

        if (aSeat.getStatus().equals("ordered")){
            throw new Exception("Seat Has Ordered");
        }else {
            aSeat.setStatus("ordered");
        }

        return seatsRepository.save(aSeat);
    }

    @Override
    public void deleteSeats(Seats seat) throws Exception {
        Seats aSeat = seatsRepository.findSeatById(seat.getSeatId().getSeatNo(), seat.getSeatId().getStudioName());
        if (aSeat == null) {
            throw new Exception("Seat tidak tersedia");
        }
        try {
            seatsRepository.deleteSeatById(seat.getSeatId().getSeatNo(), seat.getSeatId().getStudioName());
        } catch (Exception e) {
            e.getMessage();
        }
    }

}

package com.binar.challenge5.service.Interface;

import com.binar.challenge5.entities.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
    String uploadFile(Ticket ticket);
    Ticket downloadFile(Long id);
}

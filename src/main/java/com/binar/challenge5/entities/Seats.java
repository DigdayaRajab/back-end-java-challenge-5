package com.binar.challenge5.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Seats")
public class Seats {
    @EmbeddedId
    private SeatsId seatId;
    private String status;

}


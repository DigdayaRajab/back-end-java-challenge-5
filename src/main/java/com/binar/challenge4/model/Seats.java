package com.binar.challenge4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Seats {
    @EmbeddedId
    private SeatsId seatId;

    @Column
    private Character studioName;

}


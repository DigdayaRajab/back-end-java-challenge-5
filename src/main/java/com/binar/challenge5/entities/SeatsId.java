package com.binar.challenge5.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SeatsId implements Serializable {
    private Integer seatId;
}

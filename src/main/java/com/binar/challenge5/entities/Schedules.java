package com.binar.challenge5.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_schedule", nullable = false)
    private Integer idSchedule;

    @Column
    private String showDate;
    private String startingHour;
    private String endingHour;
    private String ticketPrice;

    @Transient
    private boolean state;

    @ManyToOne
    private Films film;
}

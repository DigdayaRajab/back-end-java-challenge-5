package com.binar.challenge5.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameFile;
    @Lob
    private byte[] file;
}

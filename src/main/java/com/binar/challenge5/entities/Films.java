package com.binar.challenge5.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_film", nullable = false)
    private Integer idFilm;

    @Column
    private Long filmCode;
    private String filmName;
    private String isShow;

    @Transient
    private boolean state;
}

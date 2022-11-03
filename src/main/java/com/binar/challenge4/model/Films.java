package com.binar.challenge4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
}

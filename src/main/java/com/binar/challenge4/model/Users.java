package com.binar.challenge4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @Column(name = "username")
    private String username;
    private String email;
    private String address;
    private String password;

    @Transient
    private boolean state;
}

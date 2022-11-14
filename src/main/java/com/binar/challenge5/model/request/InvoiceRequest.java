package com.binar.challenge5.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceRequest {
    private Integer idUser;
//    private String username;
//    private String email;

    private Integer idFilm;
    //    private String filmName;
//
    private String showDate;
    private String startingHour;
//    private String ticketPrice;
//
    private Character studioName;
    private Integer seatNo;
//    private SeatsId seatId;
}
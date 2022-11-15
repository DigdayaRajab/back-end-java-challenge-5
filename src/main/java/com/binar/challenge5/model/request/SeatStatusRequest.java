package com.binar.challenge5.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatStatusRequest {
    private Character studioName;
    private Integer seatNo;
}

package com.binar.challenge5.model.request;

import com.binar.challenge5.entities.Films;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FilmRequest {
    private Films films;
}

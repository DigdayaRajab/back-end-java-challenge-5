package com.binar.challenge5.service.Interface;

import com.binar.challenge5.entities.Films;
import com.binar.challenge5.model.request.FilmRequest;
import com.binar.challenge5.model.response.FilmScheduleResponse;

import java.util.List;

public interface FilmService {

    void newFilm(Films film);
    void deleteFilm(Films film);

    Films save(Films films);

    Films updateFilm(FilmRequest filmRequest) throws Exception;

    void deleteById(int idFilm);

    List<Films> findAll();

    List<Films> findFilmsShow() throws Exception;

    List<FilmScheduleResponse> findFilmsScheduleByName(String filmName) throws Exception;
}

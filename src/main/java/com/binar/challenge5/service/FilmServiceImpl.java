package com.binar.challenge5.service;

import com.binar.challenge5.entities.Films;
import com.binar.challenge5.model.request.FilmRequest;
import com.binar.challenge5.model.response.FilmScheduleResponse;
import com.binar.challenge5.repositories.FilmRepository;
import com.binar.challenge5.service.Interface.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmRepository filmRepository;

    @Override
    public void newFilm(Films film){
        filmRepository.save(film);
    }

    @Override
    public void deleteFilm(Films film){
        filmRepository.deleteById(film.getIdFilm());
    }

    @Override
    public Films save(Films films) {
        return filmRepository.save(films);
    }

    @Override
    public Films updateFilm(FilmRequest filmRequest) throws Exception {
        Films film = filmRepository.findFilmsById(filmRequest.getFilms().getIdFilm());
        if(film == null) {
            throw new Exception("Data tidak ditemukan");
        }

        return filmRepository.save(film);
    }

    @Override
    public void deleteById(int idFilm) {
        filmRepository.deleteById(idFilm);
    }

    @Override
    public List<Films> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public List<Films> findFilmsShow() throws Exception{
        List<Films> filmResponse = filmRepository.findFilmsShow();
        if(filmResponse == null) {
            throw new Exception("Data tidak ditemukan");
        }
        return filmResponse;
    }

    @Override
    public List<FilmScheduleResponse> findFilmsScheduleByName(String filmName) throws Exception{
        List<FilmScheduleResponse> filmResponse =  filmRepository.findFilmsScheduleByName(filmName);
        if(filmResponse == null) {
            throw new Exception("Data tidak ditemukan");
        }
        return filmResponse;
    }

    @Override
    public Films findFilmsById(Integer idFilm) throws Exception{
        Films filmResponse =  filmRepository.findFilmsById(idFilm);
        if(filmResponse == null) {
            throw new Exception("Data tidak ditemukan");
        }
        return filmResponse;
    }


}

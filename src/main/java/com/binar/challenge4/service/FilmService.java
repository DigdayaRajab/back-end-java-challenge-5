package com.binar.challenge4.service;

import com.binar.challenge4.model.Films;
import com.binar.challenge4.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FilmService implements FilmServiceImpl{
    @Autowired
    FilmRepository filmRepository;

    @Override
    public void newFilm(Films film){
        List<Films> flm = filmRepository.findFilmsByName(film.getFilmName());
        if(flm.size() > 0) {
            System.out.println("Film telah terdaftar !");
        }
        filmRepository.save(film);
    }

    @Override
    public void deleteFilm(Films film){
        filmRepository.deleteById(film.getIdFilm());
    }

}

package com.binar.challenge5.service;

import com.binar.challenge5.entities.Films;
import com.binar.challenge5.service.Interface.FilmService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class FilmServiceImplTest {
    @Autowired
    FilmService filmsService;

    @Test
    void newFilm(){
        Films film = new Films();

//        film.setFilmCode(1011L);
//        film.setFilmName("Jumanji");
//        film.setIsShow("true");
//        film.setState(true);

        try {
            filmsService.newFilm(film);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @Test
    void deleteFilm(){
        Films film = new Films();
        film.setIdFilm(1);

        try {
            filmsService.deleteFilm(film);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
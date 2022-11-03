package com.binar.challenge4.repository;

import com.binar.challenge4.model.Films;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FilmRepositoryTest {
    @Autowired
    FilmRepository filmRepository;

    @Test
    void tesAddData(){
        Films film = new Films();

        film.setFilmCode(1011L);
        film.setFilmName("Jumanji");
        film.setIsShow("true");
        film.setState(true);

        filmRepository.save(film);
    }
}
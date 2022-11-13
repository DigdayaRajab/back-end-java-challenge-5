package com.binar.challenge5.repositories;

import com.binar.challenge5.entities.Films;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootTest
class FilmRepositoryTest {
    @Autowired
    FilmRepository filmRepository;

    @Test
    void tesAddData() {
        Films film = new Films();

        film.setFilmCode("code");
        film.setFilmName("Jumanji");
        film.setIsShow("true");

        filmRepository.save(film);
    }

    @Test
    void tesGetUserById() {
//        List<Films> filmsList = filmRepository.findFilmsById(1);
//        filmsList.forEach(flm ->
//                System.out.println(flm.getFilmName())
//        );
    }

//    @Test
//    void tesGetUserByName() {
//        List<Films> filmsList = filmRepository.findFilmsByName("Jumanji");
//        filmsList.forEach(flm ->
//                System.out.println(flm.getIdFilm())
//        );
//    }

    @Test
    void testGetAllFilms() {
        List<Films> filmsList = filmRepository.findAllFilms();
        filmsList.forEach(flm ->
                System.out.println(flm.getFilmName())
        );
    }

    @Test
    void testGetAllUsersPageable() {
        System.out.println("Data Film  page 0");
        List<Films> filmsList0 = filmRepository.findAllFilmsWithPage(PageRequest.of(0, 2));
        filmsList0.forEach(flm ->
                System.out.println(flm.getFilmName())
        );
        System.out.println("\nData Film page 1");
        List<Films> filmsList1 = filmRepository.findAllFilmsWithPage(PageRequest.of(1, 2));
        filmsList1.forEach(flm ->
                System.out.println(flm.getFilmName())
        );
        System.out.println("\nData Film  page 2");
        List<Films> filmsList2 = filmRepository.findAllFilmsWithPage(PageRequest.of(2, 2));
        filmsList2.forEach(flm ->
                System.out.println(flm.getFilmName())
        );
    }
}
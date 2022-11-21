package com.binar.challenge5.service;

import com.binar.challenge5.entities.Films;
import com.binar.challenge5.entities.Schedules;
import com.binar.challenge5.model.request.FilmUpdateRequest;
import com.binar.challenge5.model.response.FilmScheduleResponse;
import com.binar.challenge5.service.Interface.FilmService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class FilmServiceImplTest {
    @Autowired
    FilmService filmsService;

    @Test
    void tesNewFilm(){
        Films film = new Films();

        film.setFilmCode("1011");
        film.setFilmName("Naruto Shippudent");
        film.setIsShow("show");

        Schedules schedule1 = new Schedules();
        schedule1.setShowDate("2022-11-28");
        schedule1.setStartingHour("12.00");
        schedule1.setEndingHour("13.00");
        schedule1.setTicketPrice("50000");
        Schedules schedule2 = new Schedules();
        schedule2.setShowDate("2022-11-28");
        schedule2.setStartingHour("12.00");
        schedule2.setEndingHour("13.00");
        schedule2.setTicketPrice("40000");

        List<Schedules> schedules = new ArrayList<>();
        schedules.add(schedule1);
        schedules.add(schedule2);

        film.setSchedules(schedules);
        try {
            filmsService.save(film);
            System.out.println("Successful Add Data");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void tesUpdateFilm(){
        FilmUpdateRequest film = new FilmUpdateRequest();

        film.setIdFilm(55);
        film.setFilmCode("1011");
        film.setFilmName("Naruto Shippuden");
        film.setIsShow("not show");

        try {
            FilmUpdateRequest updateFilm = filmsService.updateFilm(film);
            System.out.println("Successful Update Data " + updateFilm.getFilmName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void tesDeleteFilm(){
        try {
            filmsService.deleteById(59);
            System.out.println("Successful Delete Data ");
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @Test
    void tesGetFilmByShowing() {
        try {
            List<Films> filmList = filmsService.findFilmsShow();
            filmList.forEach(flm -> {
                System.out.println("Film Name : " + flm.getFilmName());
            });
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void tesGetSchedulesByFilmName() {
        try {
            List<FilmScheduleResponse> filmList = filmsService.findFilmsScheduleByName("Naruto Shippuden");
            filmList.forEach(flm -> {
                System.out.println("Film Name : " + flm.getFilmName());
                System.out.println("Show Date : " + flm.getShowDate());
                System.out.println("Start : " + flm.getStartingHour());
                System.out.println("End : " + flm.getEndingHour());
                System.out.println("Ticket Htm : " + flm.getTicketPrice() + "\n\n");
            });
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
package com.binar.challenge5.controller;

import com.binar.challenge5.entities.Films;
import com.binar.challenge5.model.CommonResponse;
import com.binar.challenge5.model.CommonResponseGenerator;
import com.binar.challenge5.model.request.FilmRequest;
import com.binar.challenge5.model.response.FilmScheduleResponse;
import com.binar.challenge5.repositories.SchedulesRepository;
import com.binar.challenge5.service.Interface.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> addFilm(@NonNull @RequestBody FilmRequest request){
        try {
            Films response = filmService.save(request.getFilms());
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "Success Add Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> updateFilm(@RequestBody FilmRequest paramUser) {
        try {
            Films response = filmService.updateFilm(paramUser);
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "success Edit Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @DeleteMapping("/delete")
    public CommonResponse<ResponseEntity> deleteFilm(@RequestParam("id_film") int idFilm) {
        try {
            filmService.deleteById(idFilm);
            return commonResponseGenerator.successResponse(new ResponseEntity("", HttpStatus.OK).getBody(), "Success Delete Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @GetMapping(value = "/getAllFilms", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> findAllFilms(){
        try {
        List<Films> response =  filmService.findAll();
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "Success Add Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @GetMapping(value = "/getFilmsShow", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> findFilmsShow(){
        try {
        List<Films> response =  filmService.findFilmsShow();
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "Success Add Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @GetMapping(value = "/getFilmsSchedule", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> findFilmsScheduleByName(@RequestParam("film_name") String filmName){
        try {
        List<FilmScheduleResponse> response = filmService.findFilmsScheduleByName(filmName);
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "Success Add Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

}

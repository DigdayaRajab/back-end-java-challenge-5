package com.binar.challenge5.controller;

import com.binar.challenge5.entities.Schedules;
import com.binar.challenge5.model.CommonResponse;
import com.binar.challenge5.model.CommonResponseGenerator;
import com.binar.challenge5.model.request.SchedulesRequest;
import com.binar.challenge5.model.response.ScheduleResponse;
import com.binar.challenge5.service.Interface.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> addSchedules(@RequestBody SchedulesRequest schedules) {
        try {
            ScheduleResponse response = scheduleService.addSchedule(schedules);
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "Success add data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }

    @DeleteMapping("/delete")
    public CommonResponse<ResponseEntity> deleteSchedules(@RequestParam("id") int idSchedule) {
        try {
            scheduleService.deleteSchedules(idSchedule);
            return commonResponseGenerator.successResponse(new ResponseEntity("", HttpStatus.OK).getBody(), "Success Delete Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @GetMapping(value = "getSchedulesByFilmId")
    public CommonResponse<ResponseEntity> getSchedulesByFilmId(@RequestParam("id") int idFilm) {
        try {
            List<Schedules> response = scheduleService.findByFilmId(idFilm);
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "success");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }


    @GetMapping(value = "getAllSchedules")
    public CommonResponse<ResponseEntity> getAllSchedules() {
        try {
            List<Schedules> response = scheduleService.findAll();
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "success");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }


    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> updateSchedules(@RequestBody SchedulesRequest schedules) {
        try {
            ScheduleResponse response = scheduleService.updateFilm(schedules);
            return commonResponseGenerator.successResponse(new ResponseEntity(response, HttpStatus.OK).getBody(), "success Edit Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }
}

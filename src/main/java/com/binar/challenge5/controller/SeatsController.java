package com.binar.challenge5.controller;


import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.model.CommonResponse;
import com.binar.challenge5.model.CommonResponseGenerator;
import com.binar.challenge5.service.Interface.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seats")
public class SeatsController {

    @Autowired
    SeatsService seatsService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> addSeats(@RequestBody Seats seat) {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(seatsService.newSeats(seat), HttpStatus.OK).getBody(), "Success add data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }

    @GetMapping(value = "getAllSeats")
    public CommonResponse<ResponseEntity> getAll() {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(seatsService.findAllSeats(), HttpStatus.OK).getBody(), "Success");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }

    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> updateSeat(@RequestBody Seats seat) {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(seatsService.updateSeats(seat), HttpStatus.OK).getBody(), "Success update data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }

    @DeleteMapping("/delete")
    public CommonResponse<ResponseEntity> deleteSeat(@RequestBody Seats seat) {
        try {
            seatsService.deleteSeats(seat);
            return commonResponseGenerator.successResponse(new ResponseEntity("", HttpStatus.OK).getBody(), "Success Delete Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }
}




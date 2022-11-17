package com.binar.challenge5.service.Interface;

import com.binar.challenge5.entities.Schedules;
import com.binar.challenge5.model.request.SchedulesRequest;
import com.binar.challenge5.model.response.ScheduleResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService {
    ScheduleResponse addSchedule(SchedulesRequest schedules);

    ScheduleResponse updateFilm(SchedulesRequest schedules);

    void deleteSchedules(int idSchedule);

    List<Schedules> findAll();

    List<Schedules> findByFilmId(int idFilm);

}

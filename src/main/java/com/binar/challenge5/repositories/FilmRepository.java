package com.binar.challenge5.repositories;

import com.binar.challenge5.entities.Films;
import com.binar.challenge5.model.request.FilmRequest;
import com.binar.challenge5.model.response.FilmScheduleResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Films, Integer> {

    //    Get All
    @Query(value = "select * from films", nativeQuery = true)
    List<Films> findAllFilms();

    // Get All with pagination
    @Query(value = "select * from films", nativeQuery = true)
    List<Films> findAllFilmsWithPage(Pageable pageable);

    // By Id User
    @Query(value = "select * from films where id_film = :id_film", nativeQuery = true)
    Films findFilmsById(@Param("id_film") Integer id_film);

    @Query(value = "select * from films where is_show = 'show'", nativeQuery = true)
    List<Films> findFilmsShow();

    // By Name
    @Query("select new com.binar.challenge5.model.response.FilmScheduleResponse(f.filmName, f.isShow, s.showDate, s.startingHour, s.endingHour, s.ticketPrice) FROM Films f Join f.schedules s where film_name = :film_name")
    List<FilmScheduleResponse> findFilmsScheduleByName(@Param("film_name") String file_name);


}

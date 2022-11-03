package com.binar.challenge4.repository;

import com.binar.challenge4.model.Films;
import com.binar.challenge4.model.Users;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface FilmRepository extends JpaRepository<Films, Integer> {

    //    Get All
    @Query(value = "select * from films", nativeQuery = true)
    List<Films> findAllFilms();

    // Get All with pagination
    @Query(value = "select * from films", nativeQuery = true)
    List<Films> findAllFilmsWithPage(Pageable pageable);

    // By Id User
    @Query(value = "select * from films where id_film = :id_film", nativeQuery = true)
    List<Films> findFilmsById(@Param("id_film") Integer id_film);

    // By Name
    @Query(value = "select * from films where film_name = :film_name", nativeQuery = true)
    List<Films> findFilmsByName(@Param("film_name") String file_name);


}

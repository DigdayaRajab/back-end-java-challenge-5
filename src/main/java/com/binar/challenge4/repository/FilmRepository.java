package com.binar.challenge4.repository;

import com.binar.challenge4.model.Films;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

@Resource
public interface FilmRepository extends JpaRepository<Films, Integer> {

}

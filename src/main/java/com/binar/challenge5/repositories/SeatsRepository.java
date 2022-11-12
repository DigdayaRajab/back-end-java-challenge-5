package com.binar.challenge5.repositories;

import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.entities.SeatsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, SeatsId> {
}

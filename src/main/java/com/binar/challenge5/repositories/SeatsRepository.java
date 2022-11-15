package com.binar.challenge5.repositories;

import com.binar.challenge5.entities.Seats;
import com.binar.challenge5.entities.SeatsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, SeatsId> {

    @Query(value = "select * from seats where seat_no=:seat_no and studio_name=:studio_name", nativeQuery = true)
    Seats findSeatById(@Param("seat_no") Integer seatNo,@Param("studio_name") Character studioName);

    @Query(value = "delete from seats where seat_no=:seat_no and studio_name=:studio_name", nativeQuery = true)
    void deleteSeatById(@Param("seat_no") Integer seatNo,@Param("studio_name") Character studioName);
}

package com.ciaranmckenna.learningspring.data.repository;

import com.ciaranmckenna.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository <Reservation, Long> {
    Iterable<Reservation> findReservationByResDate(java.util.Date resDate);

}

package com.HelloWay.HelloWay.repos;

import com.HelloWay.HelloWay.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByStartDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<Reservation> findByStartDateAfterOrderByStartDateAsc(LocalDateTime startDateTime);
}

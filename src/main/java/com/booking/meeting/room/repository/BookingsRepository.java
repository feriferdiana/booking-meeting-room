package com.booking.meeting.room.repository;

import com.booking.meeting.room.dao.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, UUID> {

    @Query(value = "SELECT u FROM Bookings u")
    List<Bookings> bookings();

}

package com.booking.meeting.room.repository;

import com.booking.meeting.room.dao.Rooms;
import com.booking.meeting.room.dao.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, UUID> {

    @Query(value = "SELECT u FROM Rooms u")
    List<Rooms> rooms();

}

package com.booking.meeting.room.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "bookings")
public class Bookings {

    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "room_id")
    private String totalPerson;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    @Column(name = "noted")
    private String noted;

    @Column(name = "check_in_time")
    private LocalDateTime checkInTime;

    @Column(name = "check_out_time")
    private LocalDateTime checkOutTime;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

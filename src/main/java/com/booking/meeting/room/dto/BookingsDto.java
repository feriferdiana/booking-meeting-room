package com.booking.meeting.room.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookingsDto {
    private String id;
    private String userId;
    private String totalPerson;
    private LocalDateTime bookingTime;
    private String noted;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}

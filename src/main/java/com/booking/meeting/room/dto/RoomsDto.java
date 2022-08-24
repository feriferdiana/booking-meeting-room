package com.booking.meeting.room.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoomsDto {
    private String id;
    private String roomName;
    private String roomCapacity;
    private String photo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}

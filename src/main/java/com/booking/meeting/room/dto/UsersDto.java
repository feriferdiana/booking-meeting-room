package com.booking.meeting.room.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsersDto {
    private String id;
    private String email;
    private String password;
    private String photo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}

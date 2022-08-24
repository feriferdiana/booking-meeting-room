package com.booking.meeting.room.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "rooms")
public class Rooms {

    @Id
    private String id;

    @Column(name = "room_name")
    private String roomName;

    @Column(name = "room_capacity")
    private String roomCapacity;

    @Column(name = "photo")
    private String photo;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

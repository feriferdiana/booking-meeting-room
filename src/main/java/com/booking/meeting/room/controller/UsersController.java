package com.booking.meeting.room.controller;

import com.booking.meeting.room.dto.UsersDto;
import com.booking.meeting.room.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<UsersDto> users(){
        return ResponseEntity.ok(new UsersDto());
    }

    @PostMapping
    public ResponseEntity<UsersDto> usersInsert(@RequestBody UsersDto request){
        return ResponseEntity.ok(new UsersDto());
    }

    @PutMapping
    @RequestMapping("{id}")
    public ResponseEntity<UsersDto> usersUpdate(@PathVariable String id){
        return ResponseEntity.ok(new UsersDto());
    }

    @DeleteMapping
    public ResponseEntity<UsersDto> usersDelete(@PathVariable String id)){
        return ResponseEntity.ok(new UsersDto());
    }
}

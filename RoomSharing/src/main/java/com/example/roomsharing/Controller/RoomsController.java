package com.example.roomsharing.Controller;

import com.example.roomsharing.Entity.RoomDetails;
import com.example.roomsharing.Service.impl.RoomsFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rooms")
public class RoomsController {

    @Autowired
    private RoomsFinderService roomsFinderService;

    @GetMapping("/")
    public ResponseEntity<List<RoomDetails>> getAllRooms(){

        List<RoomDetails> allRoomsList=roomsFinderService.getAllRooms();
        return new ResponseEntity<>(allRoomsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoomDetails> getRoomById(@PathVariable long id){

        RoomDetails roomBasedOnId=roomsFinderService.getRoomById(id);
        return new ResponseEntity<>(roomBasedOnId, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> postARoom(@RequestBody RoomDetails roomDetails){
        String response = roomsFinderService.addARoom(roomDetails);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }


}

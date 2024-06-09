package com.example.roomsharing.Service.impl;

import com.example.roomsharing.Entity.RoomDetails;
import com.example.roomsharing.Repository.RoomsRepository;
import com.example.roomsharing.Service.IRoomsFinderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoomsFinderService implements IRoomsFinderService {

    @Autowired
    private RoomsRepository roomsRepository;
    @Override
    public List<RoomDetails> getAllRooms() {
        return roomsRepository.findAll();
    }

    @Override
    public RoomDetails getRoomById(long id) {
        return roomsRepository.findById(id).orElse(null);
    }

    @Override
    public String addARoom(RoomDetails roomDetails) {
        roomsRepository.save(roomDetails);
        return "SuccesfullySaved";
    }
}

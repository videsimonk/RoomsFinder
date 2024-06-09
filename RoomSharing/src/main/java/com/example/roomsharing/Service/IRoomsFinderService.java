package com.example.roomsharing.Service;

import com.example.roomsharing.Entity.RoomDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoomsFinderService {

    List<RoomDetails> getAllRooms();

    RoomDetails getRoomById(long id);

    String addARoom(RoomDetails roomDetails);
}

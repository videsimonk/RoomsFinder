package com.example.roomsharing.Repository;

import com.example.roomsharing.Entity.RoomDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<RoomDetails,Long> {

}

package com.example.roomsharing.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public  class RoomDetails{

    private Long roomID;
    private String roomName;
    private int noOfBeds;
    private int noOfBaths;
    private String location;
    private double price;
    private int sharingWithHowManyPeople;
    private double averageCostMonthly;
}
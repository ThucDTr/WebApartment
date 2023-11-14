package com.example.webapartment.service;

import java.util.List;

import com.example.webapartment.model.RoomDto;

public interface RoomService {
    List<RoomDto> findAllRooms();

    RoomDto findRoomById(Long roomId);
}

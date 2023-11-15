package com.example.webapartment.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webapartment.entity.RoomEntity;
import com.example.webapartment.model.RoomDto;
import com.example.webapartment.repository.RoomRepository;
import com.example.webapartment.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomDto> findAllRooms() {
        List<RoomEntity> rooms = roomRepository.findAll();
        return rooms.stream().map((room) -> mapToRoomDto(room)).collect(Collectors.toList());
    }

    @Override
    public RoomDto findRoomById(Long roomId) {
        RoomEntity rooms = roomRepository.findById(roomId).get();
        return mapToRoomDto(rooms);
    }

    private RoomDto mapToRoomDto(RoomEntity roomEntity) {
        RoomDto roomDto = RoomDto.builder()
        .id(roomEntity.getId())
        .name(roomEntity.getName())
        .price(roomEntity.getPrice())
        .img(roomEntity.getImg())
        .description(roomEntity.getDescription())
        .build();
        return roomDto;
    }
    
}

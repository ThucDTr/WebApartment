package com.example.webapartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.webapartment.model.RoomDto;
import com.example.webapartment.service.RoomService;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/listRooms")
    public String listProducts(Model model){
        List<RoomDto> rooms = roomService.findAllRooms();
        model.addAttribute("rooms", rooms);
        return "index";
    }

    @GetMapping("/listRooms/{roomId}")
    public String roomDetail(@PathVariable("roomId") Long roomId, Model model){
            RoomDto roomDto = roomService.findRoomById(roomId);
            model.addAttribute("room", roomDto);
            return "RoomDetail";
    }

}

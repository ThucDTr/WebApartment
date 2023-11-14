package com.example.webapartment.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomDto {
   
    private Long id;
    private String name;
    private String price;
    private String img;
    private String description;
}


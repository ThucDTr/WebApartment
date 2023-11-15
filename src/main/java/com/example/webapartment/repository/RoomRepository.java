package com.example.webapartment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webapartment.entity.RoomEntity;


@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Long>{
    Optional<RoomEntity> findByImg(String img);
}

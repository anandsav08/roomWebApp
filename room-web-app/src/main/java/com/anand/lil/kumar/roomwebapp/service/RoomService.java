package com.anand.lil.kumar.roomwebapp.service;

import com.anand.lil.kumar.roomwebapp.data.RoomRepository;
import com.anand.lil.kumar.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id){
        return roomRepository.findById(id).get();
    }
}

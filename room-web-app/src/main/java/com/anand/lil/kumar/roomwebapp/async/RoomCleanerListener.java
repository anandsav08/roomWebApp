package com.anand.lil.kumar.roomwebapp.async;

import com.anand.lil.kumar.roomwebapp.models.Room;
import com.anand.lil.kumar.roomwebapp.service.RoomService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RoomCleanerListener {
    private static final Logger LOG = LoggerFactory.getLogger(RoomCleanerListener.class);

    private final ObjectMapper mapper;
    private final RoomService roomService;

    public RoomCleanerListener(ObjectMapper mapper, RoomService roomService) {
        this.mapper = mapper;
        this.roomService = roomService;
    }

    public void receiveMessage(String message){
        try{
            AsyncPayload payload = mapper.readValue(message,AsyncPayload.class);
            if("ROOM".equals(payload.getModel())){
                Room room = roomService.getById(payload.getId());
                LOG.info("Room {}:{} needs to be cleaned",room.getNumber(),room.getName());
            }else{
                LOG.warn("Unknown model type");
            }
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }
}

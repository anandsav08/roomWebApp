package com.anand.lil.kumar.roomwebapp.controllers;

//import ch.qos.logback.core.model.Model;
import com.anand.lil.kumar.roomwebapp.models.Room;
import com.anand.lil.kumar.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms",roomService.getAllRooms());
        return "rooms";
    }
}

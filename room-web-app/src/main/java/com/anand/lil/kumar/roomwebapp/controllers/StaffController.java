package com.anand.lil.kumar.roomwebapp.controllers;

import com.anand.lil.kumar.roomwebapp.models.StaffMember;
import com.anand.lil.kumar.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("staff",staffService.getAllStaff());
        return "staff";
    }
}

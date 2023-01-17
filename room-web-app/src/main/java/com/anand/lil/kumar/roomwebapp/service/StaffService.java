package com.anand.lil.kumar.roomwebapp.service;

import com.anand.lil.kumar.roomwebapp.data.RoomRepository;
import com.anand.lil.kumar.roomwebapp.data.StaffRepository;
import com.anand.lil.kumar.roomwebapp.models.Position;
import com.anand.lil.kumar.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}

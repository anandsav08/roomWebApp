package com.anand.lil.kumar.roomwebapp.data;

import com.anand.lil.kumar.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember,String> {

}

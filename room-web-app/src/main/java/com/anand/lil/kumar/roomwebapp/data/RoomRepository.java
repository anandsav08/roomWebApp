package com.anand.lil.kumar.roomwebapp.data;

import com.anand.lil.kumar.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {

}

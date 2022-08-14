package com.spring.web.application.webapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.web.application.webapp.models.Room;
import com.spring.web.application.webapp.services.RoomService;

@Controller
@RequestMapping("/roomba")
public class RoomRestController {
	public RoomService roomService;
	public RoomRestController(RoomService rooms) {
		this.roomService = rooms;
	}



	@GetMapping
	public List<Room> getAllRooms() {
		
		return roomService.getRooms();
	}
}

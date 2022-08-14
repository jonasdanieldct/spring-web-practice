package com.spring.web.application.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.web.application.webapp.services.RoomService;

@Controller
@RequestMapping("/rooms")
public class RoomController {
	private RoomService rooms = new RoomService();

	public RoomController(RoomService rooms) {
		this.rooms = rooms;
	}



	@GetMapping
	public String getAllRooms(Model model) {
		model.addAttribute("rooms",rooms.getRooms());
		return "rooms";
	}
}

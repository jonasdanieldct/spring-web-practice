package com.spring.web.application.webapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.web.application.webapp.models.Room;

@Service
public class RoomService {
	private static List<Room> rooms = new ArrayList();
	
	static {
		for(int i=0;i<10;i++) { 
			rooms.add(new Room(i,"Number"+i,"haha"));
		}
	}

	public List<Room> getRooms(){
		return rooms;
		
	}
}

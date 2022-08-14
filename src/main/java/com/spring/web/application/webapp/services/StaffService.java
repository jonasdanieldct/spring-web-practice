package com.spring.web.application.webapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.web.application.webapp.models.Staff;
@Service
public class StaffService {
	private List<Staff> staffs = new ArrayList();

	public List<Staff> getStaffs() {
		return staffs;
	}
	
	public List<Staff> addStaffs() {
			for(int i =0; i<=10 ; i++) {
				staffs.add(new Staff(i,"fname","lname","position"));
			}
		return staffs;
	}
}

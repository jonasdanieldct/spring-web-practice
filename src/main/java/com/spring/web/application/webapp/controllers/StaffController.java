package com.spring.web.application.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.web.application.webapp.services.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	private StaffService  staffService = new StaffService();

	
	@GetMapping
	public String getStaffs(Model model) {
		model.addAttribute("staff",staffService.addStaffs());
		return "staff";
	}
}

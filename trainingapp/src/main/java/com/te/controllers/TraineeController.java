package com.te.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.dtolayer.Trainees;
import com.te.servicelayer.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	private TraineeService service;

	@GetMapping("/signupForm")
	public String getSignup(ModelMap map) {
		return "signupForm";
	}

	@PostMapping("/signup")
	public String processSignupData(ModelMap map, Trainees trainee) {
		if (service.addTrainee(trainee)) {
			map.addAttribute("msg", "Your information was added sucessfully!");
			map.addAttribute("savedtrainee", trainee);
		} else {
			map.addAttribute("msg", "Unable to add trainee. Please try again later!");
		}
		return "confirmation";
	}

	@GetMapping("/getexc")
	public String exceptionOnPurpose() {
		String value = null;
		System.out.println(value.length());
		return "Champa";
	}

}

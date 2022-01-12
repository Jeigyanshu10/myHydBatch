package com.te.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.dtolayer.Trainees;
import com.te.servicelayer.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	private TraineeService service;

	@GetMapping("/signupForm")
	public String getSignup(ModelMap map, HttpServletRequest request) {

		// Reading cookie(Servlet ways of reading cookie)
		Cookie[] myCookie = request.getCookies();
		for (Cookie tempCookie : myCookie) {
			if (tempCookie.getName().equals("traineeUsername")) {
				map.addAttribute("usernameCookie", tempCookie.getValue());
			}
		}

		return "signupForm";
	}

	@PostMapping("/signup")
	public String processSignupData(ModelMap map, Trainees trainee, HttpServletResponse response) {

		// Creating cookie
		Cookie cookie = new Cookie("traineeUsername", trainee.getUsername());
		cookie.setMaxAge(60 * 60);
		response.addCookie(cookie);

		if (service.addTrainee(trainee)) {
			map.addAttribute("msg", "Your information was added sucessfully!");
			map.addAttribute("savedtrainee", trainee);
		} else {
			map.addAttribute("msg", "Unable to add trainee. Please try again later!");
		}
		return "confirmation";
	}

	@GetMapping("/gettraineeform")
	public String fetchTraineeform(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Trainees trainee) {
		if (trainee != null) {
			return "gettrainee";
		} else
			return "loginform";
	}

	@GetMapping("/gettrainee")
	public String getTraineeData(ModelMap map, @RequestParam("userid") String uid) {
		Trainees myTrainee = service.getTrainee(Integer.parseInt(uid));
		map.addAttribute("traineeFromDb", myTrainee);
		return "traineedetails";
	}

	@GetMapping("/loginpage")
	public String loginPage(ModelMap map) {
		return "loginform";
	}

	@PostMapping("/login")
	public String loginTrainee(int userId, String password, ModelMap map, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Trainees trainee = service.serviceAuthentication(userId, password);
		if (trainee != null) {
			session.setAttribute("loggedIn", trainee);
			map.addAttribute("msg", "Login Sucessfull");
		} else {
			map.addAttribute("msg", "Login unsucessful. Invalid Credentials");
		}
		return "loginconfirmation";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "loginform";
	}

	@GetMapping("/updateform")
	public String updateTraineeForm() {
		return "updateform";
	}

	@PostMapping("/update")
	public String updateTrainee(@SessionAttribute(name = "loggedIn", required = false) Trainees trainee, ModelMap map,
			Trainees updateTrainee) {
		if (trainee != null) {
			if (service.updateTrainee(updateTrainee)) {

				map.addAttribute("message", "Trainess updated sucessfully");
				map.addAttribute("updatedTrainee", updateTrainee);
			} else {
				map.addAttribute("message", "Unable to update Trainee");
			}
			return "updateconfirmation";
		} else {
			return "loginform";
		}

	}

}

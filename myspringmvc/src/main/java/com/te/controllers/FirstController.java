package com.te.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.dtos.UserDetails;

@Controller
@RequestMapping("/spring")
public class FirstController {

	// @RequestMapping(path = "/home", method = RequestMethod.GET)
	@GetMapping("/home")
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/index.jsp");
		return modelAndView;
	}

	// @RequestMapping(path = "/hello", method = RequestMethod.GET)
	@GetMapping("/hello")
	public String getMyHomePage(ModelMap map) {
		return "hello";
	}

	// @RequestMapping(path = "/search", method = RequestMethod.GET)
	@GetMapping("/search")
	public String getUserId(ModelMap map, HttpServletRequest request) {
		String userId = request.getParameter("id");
		map.addAttribute("myuserId", userId);
		return "searchResult";
	}

	@GetMapping("/loginpage")
	public String getForm(ModelMap map) {
		return "loginform";
	}

	// First way of receiving data from the view
	@PostMapping("/login")
	public String processData(ModelMap map, HttpServletRequest request) {
		String userId = request.getParameter("empId");
		String user = request.getParameter("userName");
		String password = request.getParameter("passkey");

		map.addAttribute("userId", userId);
		map.addAttribute("name", user);
		map.addAttribute("secretKey", password);
		return "searchResult";
	}

	@PostMapping("/login2")
	public String processDataTwo(@RequestParam String empId, @RequestParam String userName,
			@RequestParam String passkey, ModelMap map) {
		map.addAttribute("userId", Integer.parseInt(empId));
		map.addAttribute("name", userName);
		map.addAttribute("secretKey", passkey);
		return "searchResult";
	}

	@PostMapping("/login3")
	public String processData3(int empId, String userName, String passkey, ModelMap map) {
		map.addAttribute("userId", empId);
		map.addAttribute("name", userName);
		map.addAttribute("secretKey", passkey);
		return "searchResult";
	}

	@PostMapping("/login4")
	public String processData4(ModelMap map, UserDetails userDetails) {
//		map.addAttribute("userId", userDetails.getEmpId());
//		map.addAttribute("name", userDetails.getUserName());
//		map.addAttribute("secretKey", userDetails.getPasskey());

		map.addAttribute("userData", userDetails);
		return "searchResult";
	}

}

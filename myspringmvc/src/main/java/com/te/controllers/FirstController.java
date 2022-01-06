package com.te.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/views/index.jsp");
		return modelAndView;
	}

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String getMyHomePage(ModelMap map) {
		return "hello";
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public String getUserId(ModelMap map, HttpServletRequest request) {
		String userId = request.getParameter("id");
//		modelAndView.addObject("myuserId", userId);
//		modelAndView.setViewName("/WEB-INF/views/searchResult.jsp");
		map.addAttribute("myuserId", userId);
		return "searchResult";
	}

}

package com.te.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyForwardAndRirects {

	@GetMapping("/forward")
	public String myForward() {
		System.out.println("This is inside forward");
		return "forward:/redirect";
	}

	@GetMapping("/redirect")
	public String myRedirect() {

		System.out.println("This is inside redirect");
		return "redirect:https://www.google.com/";
	}
}

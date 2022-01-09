package com.te.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.te.mycustomexceptions.InvalidPasswordException;

@ControllerAdvice
public class AdvisorToController {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String myNullPointerException(Model model) {
		model.addAttribute("myError", "Our application has encountered a null pointer exception");
		return "error_page";
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidPasswordException.class)
	public String mycustomException(Model model, InvalidPasswordException ipe) {
		model.addAttribute("myError", ipe.getMessage());
		return "error_page";
	}

}

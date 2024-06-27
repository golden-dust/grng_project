package com.blnk.grng.controller;

import java.util.Locale;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, HttpServletRequest request, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Optional<HttpSession> sessionOptional = Optional.ofNullable(request.getSession());
		
		if (sessionOptional.isPresent()) {
			HttpSession session = sessionOptional.get();
			Optional<String> sidOptional = Optional.ofNullable((String) session.getAttribute("sid"));
			
			if (sidOptional.isPresent()) {
				return "home_login";
			}
		} 
		return "home_logout";
	}
	
}

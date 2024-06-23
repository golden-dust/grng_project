package com.blnk.grng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {
	
	@RequestMapping(value="/login")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping(value="/signup")
	public String toSignup( ) {
		return "signup";
	}
}

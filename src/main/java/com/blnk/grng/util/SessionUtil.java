package com.blnk.grng.util;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtil {

	public SessionUtil() {
		super();
	}
	
	public Boolean sessionOk(HttpServletRequest request) {
		Optional<HttpSession> sessionOptional = Optional.ofNullable(request.getSession());
		if (sessionOptional.isPresent()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean sidOk(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Optional<Object> sidOptional = Optional.ofNullable(session.getAttribute("sid"));
		if (sidOptional.isPresent()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getSid(HttpServletRequest request) {

		if (sessionOk(request)) {
			if (sidOk(request)) {
				HttpSession session = request.getSession();
				String sid = (String) session.getAttribute("sid");
				return sid;
			}
		} 
		return null;
	}

}

package com.blnk.grng.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class MCommand {
	
	public MCommand() {}

	public HttpServletRequest getRequest(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		return request;
	}

}

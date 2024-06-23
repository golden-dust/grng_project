package com.blnk.grng;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blnk.grng.command.Command;
import com.blnk.grng.command.MJoinCommand;

@Controller
public class GrngController {
	
	Command command;

	@RequestMapping(value="/signupOk")
	public String signupOk(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new MJoinCommand();
		int success = command.execute(model);
		
		if (success == 1) {
			model.addAttribute("memNickname", request.getAttribute("memNickname"));
			model.addAttribute("memId", request.getAttribute("memId"));
			return "signupOk";
		} else {
			model.addAttribute("error", "회원 가입에 실패하였습니다. 다시 시도해주세요.");
			return "signup";
		}
	}

}

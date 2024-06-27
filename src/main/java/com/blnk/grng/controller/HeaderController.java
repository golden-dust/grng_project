package com.blnk.grng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blnk.grng.dao.MemberDao;
import com.blnk.grng.dto.MemberDto;
import com.blnk.grng.util.SessionUtil;

@Controller
public class HeaderController {
	
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value="/login")
	public String toLogin() {
		return "memberControl/login";
	}
	
	@RequestMapping(value="/signup")
	public String toSignup( ) {
		return "memberControl/signup";
	}
	
	@RequestMapping(value="/logoutOk")
	public String logout(HttpServletRequest request) {
		
		SessionUtil sutil = new SessionUtil();
		if (sutil.getSid(request) != null) {
			HttpSession session = request.getSession();
			session.invalidate();
			return "memberControl/logoutOk";
		} else {
			return "memberControl/login";
		}
	}
	
	@RequestMapping(value="/mypage")
	public String mypage(HttpServletRequest request, Model model) {
		
		SessionUtil sutil = new SessionUtil();
		if (sutil.getSid(request) != null) {
			HttpSession session = request.getSession();
			String sid = (String) session.getAttribute("sid");
			
			MemberDao mDao = sqlSession.getMapper(MemberDao.class);
			MemberDto user = mDao.findById(sid);
			
			model.addAttribute("user", user);
			
			return "/memberControl/mypage";
		} else {
			return "redirect:login";
		}
	}
	
}

package com.blnk.grng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blnk.grng.dao.MemberDao;
import com.blnk.grng.dao.PetDao;
import com.blnk.grng.dto.MemberDto;
import com.blnk.grng.dto.PetDto;
import com.blnk.grng.util.SessionUtil;
import com.blnk.grng.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	SqlSession sqlSession;
		
	@RequestMapping(value="/signupOk")
	public String signup(HttpServletRequest request, HttpSession session, Model model) {
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memName = request.getParameter("memName");
		String memNickname = request.getParameter("memNickname");
		String memGender = request.getParameter("memGender");
		String memEmail = request.getParameter("memEmail");
		String memMobile = request.getParameter("memMobile");
		
		MemberDao mDao = sqlSession.getMapper(MemberDao.class);
		mDao.joinWithoutPet(memId, memPw, memName, memNickname, memGender, memEmail, memMobile);

		session.setAttribute("sid", memId);
		
		return "memberControl/signupOk";
	}
	
	@RequestMapping(value="/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		
		MemberDao mDao = sqlSession.getMapper(MemberDao.class);
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		if (mDao.checkIdAndPw(memId, memPw) == 1) {
			session.setAttribute("sid", memId);
			return "home_login";
		} else {
			model.addAttribute("failMsg", "아이디와 비밀번호를 다시 확인해주세요");
			return "redirect:login";
		}
	}
	
	@RequestMapping(value="/register-pet")
	public String registerPet(HttpServletRequest request, Model model) {
		
		SessionUtil sutil = new SessionUtil();
		if (sutil.getSid(request) != null) {
			return "/memberControl/registerPet";
		} else {
			return "redirect:login";
		}
	}
	
	@RequestMapping(value="/registerPetOk")
	public String registerPetOk(HttpServletRequest request) {
		
		int flag = 0;
		
		SessionUtil sutil = new SessionUtil();
		String sid = sutil.getSid(request);
		if (sid != null) {
			PetDto petToInsert = new PetDto(sid, request);
			PetDao pDao = sqlSession.getMapper(PetDao.class);
			flag = pDao.insertPet(sid,
					petToInsert.getPetType(), 
					petToInsert.getPetBreed(), 
					petToInsert.getPetName(), 
					petToInsert.getPetBd(), 
					petToInsert.getPetAge(),
					petToInsert.getPetSex()
					);
			System.out.println("동물등록 완료");
			MemberDao mDao = sqlSession.getMapper(MemberDao.class);
			System.out.println("반려넘버 : " + pDao.getIdByPetNameAndMemberId(petToInsert.getPetName(), sid));
			mDao.updatePetId(sid, pDao.getIdByPetNameAndMemberId(petToInsert.getPetName(), sid));
			System.out.println("반려넘버 업데이트 완료");
		} 
		return "memberControl/registerPetOk";
	}
	
	@RequestMapping(value="/modify-info")
	public String modifyInfo(HttpServletRequest request, Model model) {
		
		SessionUtil sutil = new SessionUtil();
		String sid = sutil.getSid(request);
		if (sid != null) {
			MemberDao mDao = sqlSession.getMapper(MemberDao.class);
			MemberDto user = mDao.findById(sid);
			model.addAttribute("user", user);
			return "memberControl/modifyInfo";
		} else {
			return "redirect:login";
		}
	}

}

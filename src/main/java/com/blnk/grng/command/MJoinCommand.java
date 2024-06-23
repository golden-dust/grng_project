package com.blnk.grng.command;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.blnk.grng.dto.MemberDto;
import com.blnnk.grng.dao.MemberDao;

public class MJoinCommand extends MCommand implements Command {

	public MJoinCommand() {}

	@Override
	public int execute(Model model) {
		int success = 0;
		
		HttpServletRequest request = getRequest(model);
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memEmail = request.getParameter("memEmail");
		String memName = request.getParameter("memName");
		String memNickname = request.getParameter("memNickname");
		String memGender = request.getParameter("memGender");
		String memMobile = request.getParameter("memMobile");
		
		MemberDao dao = new MemberDao();
		MemberDto memberToInsert = new MemberDto(memId, memPw, memName, memNickname, memGender, memEmail, memMobile);
		success = dao.insert(memberToInsert);
		
		return success;
	}

}

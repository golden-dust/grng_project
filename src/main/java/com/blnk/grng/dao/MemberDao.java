package com.blnk.grng.dao;

import com.blnk.grng.dto.MemberDto;

public interface MemberDao {
	
	public void joinWithoutPet(
			String memId, 
			String memPw, 
			String memName, 
			String memNickname, 
			String memGender, 
			String memEmail, 
			String memMobile
			);
	public int checkIdAndPw(String memId, String memPw);
	public MemberDto findById(String memId);
	public int updatePetId(String memId, int petId);
}

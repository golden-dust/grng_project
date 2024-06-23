package com.blnk.grng.dto;

import com.blnnk.grng.dao.PetDao;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memName;
	private String memNickname;
	private String memGender;
	private String memEmail;
	private String memMobile;
	private int petId;
	private String memDate;
	
	public MemberDto() {}
	
	public MemberDto(String memId, String memPw, String memName, String memNickname, String memGender, String memEmail, String memMobile) {
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memNickname = memNickname;
		this.memGender = memGender;
		this.memEmail = memEmail;
		this.memMobile = memMobile;
	}
	
	public MemberDto(String memId, String memPw, String memName, String memNickname, String memGender, String memEmail, String memMobile, int petId) {
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memNickname = memNickname;
		this.memGender = memGender;
		this.memEmail = memEmail;
		this.memMobile = memMobile;
		this.petId = petId;
	}
	
	public MemberDto(String memId, String memPw, String memName, String memNickname, String memGender, String memEmail, String memMobile, String petId) {
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memNickname = memNickname;
		this.memGender = memGender;
		this.memEmail = memEmail;
		this.memMobile = memMobile;
		this.petId = Integer.parseInt(petId);
	}
	
	public MemberDto(String memId, String memPw, String memName, String memNickname, String memGender, String memEmail, String memMobile, int petId, String memDate) {
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memNickname = memNickname;
		this.memGender = memGender;
		this.memEmail = memEmail;
		this.memMobile = memMobile;
		this.petId = petId;
		this.memDate = memDate;
	}
	
	public MemberDto(String memId, String memPw, String memName, String memNickname, String memGender, String memEmail, String memMobile, String petId, String memDate) {
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memNickname = memNickname;
		this.memGender = memGender;
		this.memEmail = memEmail;
		this.memMobile = memMobile;
		this.petId = Integer.parseInt(petId);
		this.memDate = memDate;
	}


	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemNickname() {
		return memNickname;
	}

	public void setMemNickname(String memNickname) {
		this.memNickname = memNickname;
	}

	public String getMemGender() {
		return memGender;
	}

	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemMobile() {
		return memMobile;
	}

	public void setMemMobile(String memMobile) {
		this.memMobile = memMobile;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getMemDate() {
		return memDate;
	}

	public void setMemDate(String memDate) {
		this.memDate = memDate;
	}

	public PetDto getMemPet() {
		PetDao dao = new PetDao();
		PetDto pet = dao.findById(this.petId);
		
		return pet;
	}

}

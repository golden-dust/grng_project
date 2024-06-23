package com.blnk.grng.dto;

import com.blnk.grng.enums.PetType;
import com.blnk.grng.util.DateTimeCalculator;

public class PetDto {
	
	private int petId;
	private String memId;
	private String petType;
	private String petBreed;
	private String petName;
	private String petBd;
	private int petAge;
	private String petGender;
	
	public PetDto() {}
	
	public PetDto(String memId, PetType pettype, String petBreed, String petName, String petBd, String petGender) {
		super();
		this.memId = memId;
		this.petType = pettype.getType();
		this.petBreed = petBreed;
		this.petName = petName;
		this.petBd = petBd;
		DateTimeCalculator cal = new DateTimeCalculator(petBd);
		this.petAge = cal.getPeriodInYears();
		this.petGender = petGender;
	}
	
	public PetDto(String memId, String petType, String petBreed, String petName, String petBd, String petGender) {
		super();
		this.memId = memId;
		this.petType = petType;
		this.petBreed = petBreed;
		this.petName = petName;
		this.petBd = petBd;
		DateTimeCalculator cal = new DateTimeCalculator(petBd);
		this.petAge = cal.getPeriodInYears();
		this.petGender = petGender;
	}
	
	
	
	public PetDto(int petId, String memId, PetType pettype, String petBreed, String petName, String petBd,
			int petAge, String petGender) {
		super();
		this.petId = petId;
		this.memId = memId;
		this.petType = pettype.getType();
		this.petBreed = petBreed;
		this.petName = petName;
		this.petBd = petBd;
		this.petAge = petAge;
		this.petGender = petGender;
	}
	
	public PetDto(int petId, String memId, String petType, String petBreed, String petName, String petBd,
			String petAge, String petGender) {
		super();
		this.petId = petId;
		this.memId = memId;
		this.petType = petType;
		this.petBreed = petBreed;
		this.petName = petName;
		this.petBd = petBd;
		this.petAge = Integer.parseInt(petAge);
		this.petGender = petGender;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetBreed() {
		return petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetBd() {
		return petBd;
	}

	public void setPetBd(String petBd) {
		this.petBd = petBd;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetGender() {
		return petGender;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	
}

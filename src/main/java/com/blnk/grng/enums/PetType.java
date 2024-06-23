package com.blnk.grng.enums;

public enum PetType {
	
	DOG("강아지"),
	CAT("고양이"),
	PLANT("식물"),
	ETC("기타");
	
	private String type;
	
	private PetType() {}
	
	private PetType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}

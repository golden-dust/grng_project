package com.blnk.grng.enums;

public enum PetType {
	
	DOG("강아지"),
	CAT("고양이"),
	HAMSTER("햄스터"), 
	BIRD("새"), 
	FISH("물고기"), 
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

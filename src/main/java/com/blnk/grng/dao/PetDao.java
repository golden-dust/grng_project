package com.blnk.grng.dao;

public interface PetDao {
	
	public int insertPet(
			String memId, 
			String petType, 
			String petBreed, 
			String petName, 
			String petBd, 
			int petAge, 
			String petSex);
	public int getIdByPetNameAndMemberId(String petName, String memId);
}

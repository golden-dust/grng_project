package com.blnnk.grng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.blnk.grng.dto.PetDto;
import com.blnk.grng.util.DateTimeCalculator;

public class PetDao extends Dao<PetDto, Integer> {
	
	public PetDao() {
		this.tableName = "pets";
		this.idName = "petId";
	}
	
	public int insert(PetDto pet) {
		int success = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO pets(memId, petType, petBreed, petBd, petAge, petGender) VALUES(?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pet.getMemId());
			ps.setString(2, pet.getPetType());
			ps.setString(3, pet.getPetBreed());
			ps.setString(4, pet.getPetBd());
			ps.setInt(5, pet.getPetAge());
			ps.setString(6, pet.getPetGender());
			
			success = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		
		return success;
	}


	public int update(int petId, String petBreed, String petName, String petBd, String petGender) {
		int success = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		DateTimeCalculator cal = new DateTimeCalculator(petBd);
		int petAge = cal.getPeriodInYears();
		String sql = "UPDATE pets SET petBreed=?, petName=?, petBd=?, petAge=?, petGender=?";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, petBreed);
			ps.setString(2, petName);
			ps.setString(3, petBd);
			ps.setInt(4, petAge);
			ps.setString(5, petGender);
			
			success = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return success;
	}

	public PetDto getPetInOneRow(ResultSet rs) throws SQLException {
		PetDto pet = null;
		int petId = rs.getInt("petId");
		String memId = rs.getString("memId");
		String petType = rs.getString("petType");
		String petBreed = rs.getString("petBreed");
		String petName = rs.getString("petName");
		String petBd = rs.getString("petBd");
		String petAge = rs.getString("petAge"); 
		// 여기서 int가 string으로 잘 불러와지는지 확인할 것
		String petGender = rs.getString("petGender");
		
		pet = new PetDto(petId, memId, petType, petBreed, petName, petBd, petAge, petGender);
		return pet;
	}
	
	public List<PetDto> findAll() {
		List<PetDto> resultList = new ArrayList<PetDto>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM " + tableName;
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			PetDto pet;
			while (rs.next()) {
				pet = getPetInOneRow(rs);
				resultList.add(pet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return resultList;
	}
	

	public PetDto findById(Integer id) {
		PetDto petToFind = null;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			rs = getResultSetById(conn, ps, id);
			if (rs.next()) {
				petToFind = getPetInOneRow(rs);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return petToFind;
	}
	
	
	public PetDto findByMemId(String id) {
		PetDto petToFind = null;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			String sql = "SELECT * FROM " + tableName + " WHERE memId=?";
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				petToFind = getPetInOneRow(rs);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return petToFind;
	}


}


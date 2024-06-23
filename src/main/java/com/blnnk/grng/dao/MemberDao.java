package com.blnnk.grng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.blnk.grng.dto.MemberDto;

public class MemberDao extends Dao<MemberDto, String>{

	public MemberDao() {
		this.tableName = "members";
		this.idName = "mid";
	}

	public int insert(MemberDto memberToInsert) {
		int success = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO members(memId, memPw, memName, memNickname, memGender, memEmail, memMobile) VALUES(?,?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, memberToInsert.getMemId());
			ps.setString(2, memberToInsert.getMemPw());
			ps.setString(3, memberToInsert.getMemName());
			ps.setString(4, memberToInsert.getMemNickname());
			ps.setString(5, memberToInsert.getMemGender());
			ps.setString(6, memberToInsert.getMemEmail());
			ps.setString(7, memberToInsert.getMemMobile());
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

	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	public MemberDto getMemberInOneRow(ResultSet rs) throws SQLException {
		MemberDto member = null;
		String memId = rs.getString("memId");
		String memPw = rs.getString("memPw");
		String memName = rs.getString("memName");
		String memNickname = rs.getString("memNickname");
		String memGender = rs.getString("memGender");
		String memEmail = rs.getString("memEmail");
		String memMobile = rs.getString("memMobile");
		int petId = rs.getInt("petId");
		String memDate = rs.getString("memDate");
		
		member = new MemberDto(memId, memPw, memName, memNickname, memGender, memEmail, memMobile, petId, memDate);
		return member;
	}

	public List<MemberDto> findAll() {
		List<MemberDto> resultList = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM " + tableName;
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			MemberDto member;
			while (rs.next()) {
				member = getMemberInOneRow(rs);
				resultList.add(member);
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

	public MemberDto findById(String memId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public MemberDto findByEmail(String memEmail) {
		return null;
	}

}

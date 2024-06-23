package com.blnnk.grng.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.blnk.grng.dto.PetDto;

public class Dao<E, T>{

	final String driverName = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/grng_db";
	final String username = "root";
	final String password = "12345";
	protected String tableName;
	protected String idName;
	
	public Dao() {}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{

		Class.forName(driverName);
		Connection c = DriverManager.getConnection(url, username, password);

		return c;
	}
	
	public HttpServletRequest getRequest(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		return request;
	}
	
	public ResultSet getResultSetById(Connection conn, PreparedStatement ps, T id) throws ClassNotFoundException, SQLException {
		conn = null;
		ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM " + tableName + " WHERE " + idName + "=?";
		
		conn = getConnection();
		ps = conn.prepareStatement(sql);
		ps.setString(1, id.toString());
		
		rs = ps.executeQuery();
		
		return rs;
	}
	
	
	public int delete(T id){
		int success = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM " + tableName + " WHERE " + idName + "=?";
		
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			if (tableName.equals("members")) {
				ps.setString(1, id.toString());
			} else {
				ps.setInt(1, (Integer) id);
			}
			success = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}

}

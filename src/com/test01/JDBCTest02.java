package com.test01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//3.
import static common.JDBCTemplate.*;

                         //2.
public class JDBCTest02 /*extends. JDBCTemplate */{
	
public static void main(String[] args) throws SQLException {
		
		//1.
		//Connection con = JDBCTemplate.getConnection();
		//2,3
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM DEPARTMENT");
		
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" : "+rs.getString(2)+" - "+rs.getString("LOCATION_ID"));
			
		}
		Close(rs);
		Close(stmt);
		Close(con);
		
}

	
		
		




}

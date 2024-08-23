package br.com.sb.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Dao {
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("Erro ao conectar ao BD");
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}

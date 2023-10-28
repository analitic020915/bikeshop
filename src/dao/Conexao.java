package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


// conexao com o banco de dados 

public class Conexao {
	String url = "jdbc:postgresql://localhost:5432/";
	String usuario = "postgres";
	String senha = "Principa020915@";
	
	public Connection getConnection() throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SistemaBike","postgres","1234");
		return conexao;
		
	}


}

	

	

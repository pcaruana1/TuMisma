package tgi.project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Gestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//Encuentra el driver
		Class.forName("org.sqlite.JDBC");
		
		//Ese driver crea una conexion con la base de datos ejemplo.db
		Connection c = DriverManager.getConnection("jdbc:sqlite:ejemplo.db");
		
		System.out.println("Database connection opened.");
		
		Statement statement = c.createStatement();
		
		
		statement.close();
		
		c.close();
		
			}catch( Exception e)
			{System.out.println(e.getMessage());}
			

	}
	
	public boolean insertarArticulo(){
		Articulo art = new Articulo(null, "Zara", "Vestido", true, 38, "verde", 100, 50, 100, "imagen", "");
		
		return true; 
	}

}

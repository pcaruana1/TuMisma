package database;

import java.sql.Connection;
import java.time.LocalDate;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import tgi.project.Propietaria;


public class Database {
	
	/** LA CONEXION A LA BASE DE DATOS SE REALIZA 1VEZ AL PRINCIPIO¿?¿?¿?*/

	public static void mostrarPropietarias()
	{
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:tienda");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM propietaria";
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				int id = rs.getInt("id_propietaria");
				String dni = rs.getString("DNI_propietaria");
				String nombre = rs.getString("nombre_propietaria");
				String apellido = rs.getString("apellidos_propietaria");
				String domicilio = rs.getString("domicilio_propietaria");
				int telefono = rs.getInt("telefono_propietaria");
				String email = rs.getString("email_propietaria");
				//java.time.LocalDate date = rs.getDate("fecha_de_nacimiento_propietaria");
				String ncuenta = rs.getString("ncuenta_propietaria");
				System.out.println("Propietaria: " + id +" "+ dni +" "+ nombre + " " + apellido + "\n"
						+ domicilio +" "+ telefono +" "+ email +" "+ /*date.toString() +*/ ncuenta);
			}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
			}
	
	public static void mostrarContratosPropietarias()
	{
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:tienda");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM contrato_propietaria";
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				String ncontrato = rs.getString("ncontrato_propietaria");
				int id = rs.getInt("id_propietaria");
				//java.sql.Date fecha_contrato = rs.getDate("fecha_de_contrato");
				//java.sql.Date fecha_fin_contrato = rs.getDate("fecha_fin_de_contrato");
				int n_renovaciones = rs.getInt("nrenovaciones_contrato");
				System.out.println("Propietaria: " + id +"\nNumero Contrato: "+ ncontrato 
						+"Validez: "+ /*fecha_contrato.toString() +*/ " hasta " +
						/*fecha_fin_contrato.toString() +*/" numero de renovaciones "+ n_renovaciones);
			}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
			}
	
	public static void mostrarArticulos()
	{
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:tienda");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM articulo";
			Statement statement = c.createStatement();
			
			
			
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				String designer = rs.getString("designer");
				int id = rs.getInt("nref_articulo");
				String tipo_articulo = rs.getString("tipo_articulo");
				Boolean disponibilidad = rs.getBoolean("disponibilidad");
				int talla = rs.getInt("talla");
				String color = rs.getString("color");
				int fianza = rs.getInt("fianza");
				int precio_alquiler = rs.getInt("precio_alquiler");
				//IMAGEN¿?
				String comentarios = rs.getString("comentarios");
				System.out.println("Articulo: " + id +"\nDiseñador: "+ designer 
						+"Tipo: "+ tipo_articulo + " Disponible: " +
						disponibilidad +" talla: "+ talla + " color: "+ color
						+" fianza: " + fianza + " precio alquiler: "+ precio_alquiler+
						"\nComentarios: " +comentarios);
			}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
			}
	
	public static Propietaria buscarPropietaria(String dni_propietaria)
	{
		/**DEVOLVER OBJETO*/
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:tienda");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM propietaria WHERE DNI_propietaria=" + dni_propietaria;
			Statement statement = c.createStatement();
			
			
			ResultSet rs = statement.executeQuery(solicitud);
			int id;
			String dni;
			String nombre;
			String apellido;
			String domicilio;
			int telefono;
			String email;
			//java.sql.Date date = rs.getDate("fecha_de_nacimiento_propietaria");
			String ncuenta;

			while(rs.next()){
				id = rs.getInt("id_propietaria");
				dni = rs.getString("DNI_propietaria");
				nombre = rs.getString("nombre_propietaria");
				apellido = rs.getString("apellidos_propietaria");
				domicilio = rs.getString("domicilio_propietaria");
				telefono = rs.getInt("telefono_propietaria");
				email = rs.getString("email_propietaria");
				//java.sql.Date date = rs.getDate("fecha_de_nacimiento_propietaria");
				ncuenta = rs.getString("ncuenta_propietaria");
				System.out.println("Propietaria: " + id +" "+ dni +" "+ nombre + " " + apellido + "\n"
						+ domicilio +" "+ telefono +" "+ email +" "+ /*date.toString() +*/ ncuenta);
				
				Propietaria propietaria = new Propietaria(dni, nombre, apellido, domicilio, telefono, email, null, ncuenta);
				return propietaria;
				}
			rs.close();
			statement.close();
			c.close();
			
			}catch (Exception e)
				{System.out.println(e.getMessage());}
			return null;
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buscarPropietaria("37812387R");
	}
}

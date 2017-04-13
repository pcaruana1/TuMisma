package database;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import tgi.project.Articulo;
import tgi.project.ContratoPropietaria;
import tgi.project.Propietaria;


public class Database {
	
	/** LA CONEXION A LA BASE DE DATOS SE REALIZA 1VEZ AL PRINCIPIO*/

	public static List<Propietaria> mostrarPropietarias()
	{
		List<Propietaria> lista_propietarias = new ArrayList<>();
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Patty/Documents/TuMisma/tienda.db");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM propietaria";
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);
			int id;
			String dni;
			String nombre;
			String apellido;
			String domicilio;
			int cp;
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
				cp = rs.getInt("codigopostal_propietaria");
				telefono = rs.getInt("telefono_propietaria");
				email = rs.getString("email_propietaria");
				//java.sql.Date date = rs.getDate("fecha_de_nacimiento_propietaria");
				ncuenta = rs.getString("ncuenta_propietaria");
			
				
				Propietaria propietaria = new Propietaria(id, dni, nombre, apellido, domicilio, cp, telefono, email, ncuenta);
				lista_propietarias.add(propietaria);
				}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		return lista_propietarias;
			}
	
	public static List<ContratoPropietaria> mostrarContratosPropietarias()
	{
		List<ContratoPropietaria> lista_contratos = new ArrayList<>();
		
		try{
			
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Patty/Documents/TuMisma/tienda.db");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM contrato_propietaria";
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				int ncontrato = rs.getInt("ncontrato_propietaria");
				int id = rs.getInt("id_propietaria");
				//java.sql.Date fecha_contrato = rs.getDate("fecha_de_contrato");
				//java.sql.Date fecha_fin_contrato = rs.getDate("fecha_fin_de_contrato");
				int n_renovaciones = rs.getInt("nrenovaciones_contrato");
				
				Propietaria p = new Propietaria(id);
				ContratoPropietaria contrato = new ContratoPropietaria(ncontrato, p, n_renovaciones);
				lista_contratos.add(contrato);
			}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
			return lista_contratos;
			}
	
	public static List<Articulo> mostrarArticulos()
	{
		List<Articulo> lista_articulos = new ArrayList<>();
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Patty/Documents/TuMisma/tienda.db");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM articulo";
			Statement statement = c.createStatement();
			
			
			
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				String designer = rs.getString("marca");
				String id = rs.getString("nref_articulo");
				String tipo_articulo = rs.getString("tipo_articulo");
				Boolean disponibilidad = rs.getBoolean("disponibilidad");
				int talla = rs.getInt("talla");
				String color = rs.getString("color");
				int fianza = rs.getInt("fianza");
				int precio_alquiler = rs.getInt("precio_alquiler");
				int precio_venta = rs.getInt("precio_venta");
				//IMAGEN¿?
				String comentarios = rs.getString("comentarios");
				
				Articulo articulo = new Articulo(id, designer, tipo_articulo, disponibilidad, talla, color, fianza, precio_alquiler, precio_venta, null, comentarios);
				lista_articulos.add(articulo);
			
			}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
		return lista_articulos;
			}
	
	public static List<ContratoPropietaria> buscarContrato(Propietaria propietaria)
	{
		List<ContratoPropietaria> lista_contratos = new ArrayList<>();
		
		try{
			
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Patty/Documents/TuMisma/tienda.db");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM contrato_propietaria WHERE id_propietaria="
			+"'"+propietaria.getId_propietaria()+"'";
			System.out.println(propietaria.getId_propietaria());
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				int ncontrato = rs.getInt("ncontrato_propietaria");
				//java.sql.Date fecha_contrato = rs.getDate("fecha_de_contrato");
				//java.sql.Date fecha_fin_contrato = rs.getDate("fecha_fin_de_contrato");
				int n_renovaciones = rs.getInt("nrenovaciones_contrato");
				
				ContratoPropietaria contrato = new ContratoPropietaria(ncontrato, propietaria, n_renovaciones);
				lista_contratos.add(contrato);
				System.out.println(lista_contratos.isEmpty());
			}
			rs.close();
			statement.close();
			c.close();
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
			return lista_contratos;
	}
	
	public static List<Propietaria> buscarPropietaria(String dni_propietaria)
	{
		/**ESTA FUNCION DEVUELVE UNA LISTA CON LAS PROPIETARIAS QUE TIENEN ESE DNI*/
		List<Propietaria> lista_propietarias = new ArrayList<>();
		try{
			//Encuentra el driver
			Class.forName("org.sqlite.JDBC");
			
			//Ese driver crea una conexion con la base de datos tienda.db
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Patty/Documents/TuMisma/tienda.db");
			
			System.out.println("Database connection opened.");
			
			String solicitud = "SELECT * FROM propietaria WHERE DNI_propietaria=" + "'"+dni_propietaria+"'";
			Statement statement = c.createStatement();
			
			
			ResultSet rs = statement.executeQuery(solicitud);
			int id;
			String dni;
			String nombre;
			String apellido;
			String domicilio;
			int cp;
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
				cp = rs.getInt("codigopostal_propietaria");
				telefono = rs.getInt("telefono_propietaria");
				email = rs.getString("email_propietaria");
				//java.sql.Date date = rs.getDate("fecha_de_nacimiento_propietaria");
				ncuenta = rs.getString("ncuenta_propietaria");
				
				
				Propietaria propietaria = new Propietaria(id, dni, nombre, apellido, domicilio, cp, telefono, email, ncuenta);
				lista_propietarias.add(propietaria);
				}
			rs.close();
			statement.close();
			c.close();
			
			}catch (Exception e)
				{System.out.println(e.getMessage());}
			return lista_propietarias;
			}
	
	public static void borrarPropietaria(Propietaria propietaria)
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Propietaria p = new Propietaria(3, "53995653W","m", "m", "m",28222, 2,"m","m" );
//	List<ContratoPropietaria> rs = buscarContrato(p);
//	System.out.println(rs.isEmpty());
		
	}
}

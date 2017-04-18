package database;

import java.sql.Connection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tgi.project.Articulo;
import tgi.project.ContratoPropietaria;
import tgi.project.ContratoPropietariaArticulo;
import tgi.project.Propietaria;




/** Esta clase interactúa con el gestor de bases de datos*/
public class Database {
	
	
	private Connection c;


	  public static java.sql.Date asDate(LocalDate localDate) {
	    return java.sql.Date.valueOf(localDate);
	  }
	  
	  public static LocalDate asLocalDate(java.sql.Date date){
		 return date.toLocalDate();
	  }
	
	public void connection() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
			System.out.println("Database connection opened.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void disconnection() {
		try {
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	/**Creación de tablas*/
	public void createTables() {
		try {

			Statement stmt1 = c.createStatement();

			String sql1 = "CREATE TABLE clienta_alquiler " + "(id_clienta_alquiler INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " DNI_clienta_alquiler VARCHAR NOT NULL, " + " nombre_clienta_alquiler  TEXT NOT NULL," + " apellidos_clienta_alquiler TEXT NOT NULL,"
					+ " domicilio_clienta_alquiler	VARCHAR NOT NULL," + " telefono_clienta_alquiler INTEGER ," + " email_clienta_alquiler VARCHAR NOT NULL,"
					+ " fecha_de_alta_clienta_alquiler DATE,"+ " descuento_clienta_alquiler INTEGER,"
					+ " fecha_de_nacimiento_clienta_alquiler DATE";

			stmt1.executeUpdate(sql1);
			stmt1.close();
			
			Statement stmt2 = c.createStatement();

			String sql2 = "CREATE TABLE propietaria " + "(id_propietaria INTEGER PRIMARY KEY AUTOINCREMENT,"
					+ " DNI_propietaria VARCHAR NOT NULL, " + " nombre_propietaria  TEXT NOT NULL," + " apellidos_propietaria TEXT NOT NULL,"
					+ " domicilio_propietaria VARCHAR NOT NULL," + " telefono_propietaria INTEGER ," + " email_propietaria VARCHAR NOT NULL,"
					+ " fecha_de_nacimiento_propietaria DATE,"+"ncuenta_propietaria VARCHAR NOT NULL";

			stmt2.executeUpdate(sql2);
			stmt2.close();
			
			Statement stmt3 = c.createStatement();

			String sql3 = "CREATE TABLE articulo " + "(nref_articulo INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " marca VARCHAR, " + " tipo_articulo  TEXT," + " disponibilidad BOOLEAN,"
					+ " talla INTEGER," + " color TEXT ," + " fianza INTEGER,"+ " precio_alquiler INTEGER,"
					+ " precio_venta INTEGER,"+"imagen BLOB," + " comentarios VARCHAR";

			stmt3.executeUpdate(sql3);
			stmt3.close();
			
			Statement stmt4 = c.createStatement();

			String sql4 = "CREATE TABLE contrato_propietaria " + "(ncontrato_propietaria INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " id_propietaria INTEGER NOT NULL REFERENCES propietaria(id_propietaria), " + " precio_tasacion INTEGER," 
					+ " precio_alquiler INTEGER";

			stmt4.executeUpdate(sql4);
			stmt4.close();
			
			Statement stmt5 = c.createStatement();

			String sql5 = "CREATE TABLE contrato_articulo " + "(nref_articulo INTEGER  PRIMARY KEY,"
					+ " ncontrato_propietaria INTEGER NOT NULL REFERENCES contrato_propietaria(ncontrato_propietaria), " + " fecha_de_contrato DATE NOT NULL," 
					+ " fecha_fin_de_contrato DATE NOT NULL," + " nrenovaciones_contrato VARCHAR NOT NULL";

			stmt5.executeUpdate(sql5);
			stmt5.close();
			
			Statement stmt6 = c.createStatement();

			String sql6 = "CREATE TABLE alquilar " + "(id_alquiler INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " id_pago INTEGER NOT NULL REFERENCES pagos_propietaria(id_pago), " + " nref_articulo INTEGER NOT NULL REFERENCES articulo(nref_articulo)," 
					+ " id_clienta_alquiler INTEGER NOT NULL REFERENCES clienta_alquiler(id_clienta_alquiler)," + " fecha_recogida DATE NOT NULL,"
					+ " fecha_devolucion DATE NOT NULL," + " seguro INTEGER NOT NULL,"+ " fianza INTEGER NOT NULL, " + " codigo_descuento varchar,";

			stmt6.executeUpdate(sql6);
			stmt6.close();
			
			Statement stmt7 = c.createStatement();

			String sql7 = "CREATE TABLE compra " + "(id_compra INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " nref_articulo INTEGER NOT NULL REFERENCES contrato_articulo (nref_articulo)," + " fecha_venta DATE NOT NULL";

			stmt7.executeUpdate(sql7);
			stmt7.close();
			
			Statement stmt8 = c.createStatement();

			String sql8 = "CREATE TABLE proveedor " + "(id_proveedor INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " nombre_proveedor VARCHAR UNIQUE NOT NULL," + " ubicacion_proveedor VARCHAR NOT NULL"
					+ "contacto VARCHAR";

			stmt8.executeUpdate(sql8);
			stmt8.close();
			
			
			Statement stmt9 = c.createStatement();

			String sql9 = "CREATE TABLE compras_proveedor " + "(id_ticket INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " id_proveedor INTEGER NOT NULL REFERENCES proveedor (id_proveedor)," + " precio_unidad INTEGER NOT NULL"
					+ " fecha_compra DATE";

			stmt9.executeUpdate(sql9);
			stmt9.close();
			
			
			//PRIMARY KEY son id_ticket y nref_tienda_proveedor
			Statement stmt10 = c.createStatement();

			String sql10 = "CREATE TABLE compras_proveedor_articulo " + "(id_ticket INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " nref_tienda_proveedor INTEGER UNIQUE NOT NULL," + " precio_unidad INTEGER NOT NULL"
					+ " nref_articulo INTEGER UNIQUE NOT NULL REFERENCES articulo (nref_articulo)";

			stmt10.executeUpdate(sql10);
			stmt10.close();
			
			
			Statement stmt11 = c.createStatement();

			String sql11 = "CREATE TABLE pagos_propietaria " + "(id_pago INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " id_propietaria INTEGER NOT NULL," + " dinero INTEGER NOT NULL"
					+ " forma_pago VARCHAR NOT NULL" + " fecha_pago DATE"
					+ "pagado BOOLEAN REFERENCES propietaria (nref_articulo)";

			stmt11.executeUpdate(sql11);
			stmt11.close();
			
			System.out.println("Tables created.");
			// Create table: end

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	//Borrado de todas las tablas
	public void deleteAll(){
		try{
			Statement delete = c.createStatement();
			delete.executeUpdate("drop table if exists clienta_alquiler");
			delete.executeUpdate("drop table if exists propietaria");
			delete.executeUpdate("drop table if exists articulo");
			delete.executeUpdate("drop table if exists contrato_propietaria");
			delete.executeUpdate("drop table if exists contrato_articulo");
			delete.executeUpdate("drop table if exists alquilar");
			delete.executeUpdate("drop table if exists compra");
			delete.executeUpdate("drop table if exists proveedor");
			delete.executeUpdate("drop table if exists compras_proveedor");
			delete.executeUpdate("drop table if exists compras_proveedor_articulo");
			delete.executeUpdate("drop table if exists pagos_propietaria");
			
			delete.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}
	
	
	//Borrado de datos en una tabla
	public void deletePropietaria(Propietaria prop){
		try{
			Statement delete = c.createStatement();
			String sql = "DELETE FROM propietaria WHERE DNI_propietaria= '" + prop.getDNI_propietaria() +"';";
			delete.executeUpdate(sql);
			
			delete.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	/**Inserta una nueva propietaria y devuelve su id*/
	
	public int insertPropietaria(Propietaria prop) {
		try {

			String sql = "INSERT INTO propietaria (id_propietaria, DNI_propietaria, nombre_propietaria, "
					+ "apellidos_propietaria, domicilio_propietaria, codigopostal_propietaria, telefono_propietaria, email_propietaria,"
					+ "ncuenta_propietaria) " + "VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement prep = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			prep.setNull(1, java.sql.Types.INTEGER);
			prep.setString(2, prop.getDNI_propietaria());
			prep.setString(3, prop.getNombre_propietaria());
			prep.setString(4, prop.getApellidos_propietaria());
			prep.setString(5, prop.getDomicilio_propietaria());
			prep.setInt(6, prop.getCodigopostal_propietaria());
			prep.setInt(7, prop.getTelefono_propietaria());
			prep.setString(8, prop.getEmail_propietaria());
			//prep.setDate(9, asDate(prop.getFecha_de_nacimiento_propietaria()));
			prep.setString(9, prop.getNcuenta_propietaria());

			prep.executeUpdate();
			
			int generatedKey;
			ResultSet rs = prep.getGeneratedKeys();
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			    System.out.println("Propietaria añadida con id: "+ generatedKey);
			    return generatedKey;
			}
			
			prep.close();
			
			return 0;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	
	
	public int insertContratoProp(ContratoPropietaria contrProp) {
		try {

			String sql = "INSERT INTO contrato_propietaria (ncontrato_propietaria, id_propietaria,"
					+ " nrenovaciones_contrato) " + "VALUES (?,?,?)";
			PreparedStatement prep = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			prep.setNull(1, java.sql.Types.INTEGER);
			prep.setInt(2, contrProp.getPropietaria().getId_propietaria());
//			prep.setDate(3, asDate(contrProp.getFecha_de_contrato()));
//			prep.setDate(4, asDate(contrProp.getFecha_fin_de_contrato()));

			prep.setInt(3, contrProp.getNrenovaciones_contrato());


			prep.executeUpdate();
			
			int generatedKey;
			ResultSet rs = prep.getGeneratedKeys();
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			    System.out.println("Contrato añadido con id: "+ generatedKey);
			    return generatedKey;
			}
			
			prep.close();
			
			return 0;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public void insertContratoPropArt(ContratoPropietariaArticulo contrPropArt) {
		try {

			String sql = "INSERT INTO contrato_articulo (nref_articulo , ncontrato_propietaria , precio_tasacion , "
					+ "precio_alquiler) " + "VALUES (?,?,?,?)";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setInt(1, contrPropArt.getArticulo().getNref_articulo());
			prep.setInt(2, contrPropArt.getContrato().getNcontrato_propietaria());
			prep.setInt(3, contrPropArt.getPrecio_tasacion());
			prep.setInt(4, contrPropArt.getArticulo().getPrecioAlquiler());

			prep.executeUpdate();
			
			
			prep.close();
			System.out.println("Contrato articulo añadido");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	
	
	public int insertArticulo(Articulo art) {
		try {

			String sql = "INSERT INTO articulo (nref_articulo, marca, tipo_articulo,"
					+ "disponibilidad, talla, color, fianza, precio_alquiler,"
					+ "precio_venta, comentarios) " + "VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement prep = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			prep.setNull(1, java.sql.Types.INTEGER);
			prep.setString(2, art.getDesigner());
			prep.setString(3, art.getTipo_articulo());
			prep.setBoolean(4, art.isDisponibilidad());
			prep.setInt(5, art.getTalla());
			prep.setString(6, art.getColor());
			prep.setInt(7, art.getFianza());
			prep.setInt(8, art.getPrecioAlquiler());
			prep.setInt(9, art.getPrecioVenta());
			//prep.setBlob(10, art.getImagen());
			prep.setString(10, art.getComentarios());


			prep.executeUpdate();
			int generatedKey;
			ResultSet rs = prep.getGeneratedKeys();
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			    System.out.println("Articulo añadido con id: " + generatedKey);			    
			    return generatedKey;
			}
			prep.close();
			
			return 0;
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	


	public List<Propietaria> mostrarPropietarias()
	{
		List<Propietaria> lista_propietarias = new ArrayList<>();
		try{
			
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
			LocalDate  date;
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
				//date = asLocalDate(rs.getDate("fecha_de_nacimiento_propietaria"));
				ncuenta = rs.getString("ncuenta_propietaria");
			
				
				Propietaria propietaria = new Propietaria(id, dni, nombre, apellido, domicilio, cp, telefono, email, ncuenta);
				lista_propietarias.add(propietaria);
				}
			rs.close();
			statement.close();
			
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		return lista_propietarias;
			}
	
	public List<ContratoPropietaria> mostrarContratosPropietarias()
	{
		List<ContratoPropietaria> lista_contratos = new ArrayList<>();
		
		try{
			
			String solicitud = "SELECT * FROM contrato_propietaria";
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				int ncontrato = rs.getInt("ncontrato_propietaria");
				int id = rs.getInt("id_propietaria");
				//LocalDate fecha_contrato = asLocalDate(rs.getDate("fecha_de_contrato"));
				//LocalDate fecha_fin_contrato = asLocalDate(rs.getDate("fecha_fin_de_contrato"));
				int n_renovaciones = rs.getInt("nrenovaciones_contrato");
				
				Propietaria p = new Propietaria(id);
				ContratoPropietaria contrato = new ContratoPropietaria(ncontrato, p, n_renovaciones);
				lista_contratos.add(contrato);
			}
			rs.close();
			statement.close();
			
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
			return lista_contratos;
			}
	
	public List<Articulo> mostrarArticulos()
	{
		List<Articulo> lista_articulos = new ArrayList<>();
		try{			
			String solicitud = "SELECT * FROM articulo";
			Statement statement = c.createStatement();
			
			
			
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				String designer = rs.getString("marca");
				int id = rs.getInt("nref_articulo");
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
			
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
		return lista_articulos;
			}
	
	
	
	public  List<ContratoPropietariaArticulo> buscarContratoArticulo(ContratoPropietaria co)
	{
		List<ContratoPropietariaArticulo> lista_contratos = new ArrayList<>();
		
		try{
					
			String solicitud = "SELECT * FROM contrato_articulo WHERE ncontrato_propietaria="
			+co.getNcontrato_propietaria();
			
			Statement statement = c.createStatement();
			
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				int nref_articulo = rs.getInt("nref_articulo");
				int precio_tasacion = rs.getInt("precio_tasacion");
				int precio_alquiler = rs.getInt("precio_alquiler");
				
		
				ContratoPropietariaArticulo contrato = new ContratoPropietariaArticulo(new Articulo(nref_articulo),	co, precio_tasacion, precio_alquiler);
				lista_contratos.add(contrato);
			}
			rs.close();
			statement.close();
			
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
			return lista_contratos;
	}
	
	
	public  List<ContratoPropietaria> buscarContrato(Propietaria propietaria)
	{
		List<ContratoPropietaria> lista_contratos = new ArrayList<>();
		
		try{
			
					
			String solicitud = "SELECT * FROM contrato_propietaria WHERE id_propietaria="
			+"'"+propietaria.getId_propietaria()+"'";
			
			Statement statement = c.createStatement();
			
						
			ResultSet rs = statement.executeQuery(solicitud);

			while(rs.next()){
				int ncontrato = rs.getInt("ncontrato_propietaria");
				LocalDate fecha_contrato = asLocalDate(rs.getDate("fecha_de_contrato"));
				LocalDate fecha_fin_contrato = asLocalDate(rs.getDate("fecha_fin_de_contrato"));
				int n_renovaciones = rs.getInt("nrenovaciones_contrato");
				
				ContratoPropietaria contrato = new ContratoPropietaria(ncontrato, propietaria, n_renovaciones, fecha_fin_contrato, fecha_contrato);
				lista_contratos.add(contrato);
				
			}
			rs.close();
			statement.close();
			
				}catch (Exception e)
				{System.out.println(e.getMessage());}
		
			return lista_contratos;
	}
	
	public  List<Propietaria> buscarPropietaria(String dni_propietaria)
	{
		/**ESTA FUNCION DEVUELVE UNA LISTA CON LAS PROPIETARIAS QUE TIENEN ESE DNI*/
		List<Propietaria> lista_propietarias = new ArrayList<>();
		try{
						
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
			LocalDate date;
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
				//date = asLocalDate(rs.getDate("fecha_de_nacimiento_propietaria"));
				ncuenta = rs.getString("ncuenta_propietaria");
				
				
				Propietaria propietaria = new Propietaria(id, dni, nombre, apellido, domicilio, cp, telefono, email, ncuenta);
				lista_propietarias.add(propietaria);
				}
			rs.close();
			statement.close();
			
			
			}catch (Exception e)
				{System.out.println(e.getMessage());}
			return lista_propietarias;
			}
	
	
	/**ACTUALIZA PERO NO SE GUARDA*/
	public void updatePropietaria(Propietaria propietaria){
		try{						
		
		String sql = "UPDATE propietaria SET DNI_propietaria = ?, nombre_propietaria = ?, "
			    		+ "apellidos_propietaria = ?, domicilio_propietaria = ?,"
			    		+ "codigopostal_propietaria = ?, telefono_propietaria = ?,"
			    		+ " email_propietaria = ?,ncuenta_propietaria = ? "
			    		+ " WHERE id_propietaria = ?";
		System.out.println(propietaria.getApellidos_propietaria());
		PreparedStatement update = c.prepareStatement(sql);

		update.setString(1, propietaria.getDNI_propietaria());
		update.setString(2, propietaria.getNombre_propietaria());
		update.setString(3, propietaria.getApellidos_propietaria());
		update.setString(4, propietaria.getDomicilio_propietaria());
		update.setInt(5, propietaria.getCodigopostal_propietaria());
		update.setInt(6, propietaria.getTelefono_propietaria());
		update.setString(7, propietaria.getEmail_propietaria());
		update.setString(8, propietaria.getNcuenta_propietaria());
		update.setInt(3, propietaria.getId_propietaria());


		update.executeUpdate();
		System.out.println("Update finished.");
		
		update.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

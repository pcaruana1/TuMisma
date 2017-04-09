package interfaz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import tgi.project.Articulo;
import tgi.project.ContratoPropietaria;
import tgi.project.Propietaria;
import database.Database;

public class Interfaz {

	public static void main(String[] args) {

		Database db = new Database();

		ArrayList<Propietaria> propietarias = new ArrayList<Propietaria>();
		
////		(int id_propietaria, String dNI_propietaria,
//		String nombre_propietaria, String apellidos_propietaria,
//		String domicilio_propietaria, int telefono_propietaria,
//		String email_propietaria,
//		LocalDate fecha_de_nacimiento_propietaria,
//		String ncuenta_propietaria)
		
//		Propietaria prop1 = new Propietaria (1,"09227824R", "Ana", "Perez", "Calle Luz 8",603784587, "luz@gmail.com", new Date(1993,05,09), "999");

		
		//Creacion de un articulo sin propietaria
		Articulo art1 = new Articulo ( "0001", "Sfera", "Blusa", true, 38, "Azul", 10, 50, 70, null, null);
		Articulo art2 = new Articulo ( "0002", "Mango", "Pantalom", true, 38, "Negro", 15, 60, 80, null, null);
		ArrayList<Articulo> articulos = new ArrayList<Articulo>();
		
		mostrarArticulo(art1);
		mostrarArticulo(art2);

		//Modifico la disponibilidad de un articulo
		art1.setDisponibilidad(false);

		//Modifico algun comentario respecto al articulo
		art1.setComentarios("Se encuentra fuera de la tienda temporalmente");
		art1.getComentarios();
		
		

		//Creacion de un contrato-propietaria
		ContratoPropietaria cont1= new ContratoPropietaria (0, 1, new Date (2017,02,04),new Date (2017,06,04), 0, prop1 );
				
		ArrayList<ContratoPropietaria> contratos = new ArrayList<ContratoPropietaria>();

		//Modifico las renovaciones
		cont1.getNcontrato_propietaria();
		cont1.getFecha_fin_de_contrato();
		cont1.setNrenovaciones_contrato(1);



		//Guardamos los datos en la BD
		//db.insertarPropietaria(prop1);
		//db.insertarArticulo(art1);

	}
	
	
	private static void mostrarArticulo(Articulo art1) {
		System.out.println ("Articulo"+ art1+ "Talla" + art1.getTalla());		
	}

}

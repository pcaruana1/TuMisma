package interfaz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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
		Propietaria prop1 = new Propietaria (1,"09227824R", "Ana", "Perez", "Calle Luz 8",603784587, "luz@gmail.com", new Date(1993,05,09), "999");


	}

}

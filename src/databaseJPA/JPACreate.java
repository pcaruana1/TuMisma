package databaseJPA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import tgi.project.Propietaria;


public class JPACreate {

	public static void main(String[] args) throws IOException {
		// Get the entity manager
		EntityManager em = Persistence.createEntityManagerFactory("company-provider").createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("PRAGMA foreign_keys=ON").executeUpdate();
		em.getTransaction().commit();
		
		/**
		 * ID_PROPIETARIA, DNI_PROPIETARIA, APELLIDOS_PROPIETARIA, CODIGOPOSTAL_PROPIETARIA, 
		 * DOMICILIO_PROPIETARIA, EMAIL_PROPIETARIA, FECHA_DE_NACIMIENTO_PROPIETARIA,
		 *  NCUENTA_PROPIETARIA, NOMBRE_PROPIETARIA, TELEFONO_PROPIETARIA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
		 */
		
		// Get the department info from the command prompt
		System.out.println("Introduzca la informacion de propietaria:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nombre: ");
		String nombre = reader.readLine();
		System.out.print("Apellidos: ");
		String apellidos = reader.readLine();
		System.out.print("DNI: ");
		String dni = reader.readLine();
		System.out.print("Domicilio: ");
		String domicilio = reader.readLine();
		System.out.print("Codigo Postal: ");
		String cp = reader.readLine();
		System.out.print("Email: ");
		String email = reader.readLine();
		System.out.print("Nº cuenta: ");
		String n_cuenta = reader.readLine();
		System.out.print("Telefono: ");
		String telefono = reader.readLine();
					
		// Create the object
		Propietaria propietaria = new Propietaria(dni, nombre, apellidos, domicilio, Integer.parseInt(cp), Integer.parseInt(telefono), email, n_cuenta);
		
		// Begin transaction 
		em.getTransaction().begin();
		// Store the object
		em.persist(propietaria);
		// End transaction
		em.getTransaction().commit();
		
		// Close the entity manager
		em.close();
	}

}

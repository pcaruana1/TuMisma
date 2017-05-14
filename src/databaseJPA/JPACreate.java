package databaseJPA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		
		// Get the department info from the command prompt
		System.out.println("Introduzca la informacion de propietaria:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nombre: ");
		String nombre = reader.readLine();
		System.out.print("Apellidos: ");
		String apellidos = reader.readLine();
					
		// Create the object
		Propietaria propietaria = new Propietaria();
		
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

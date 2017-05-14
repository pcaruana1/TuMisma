package databaseJPA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tgi.project.Propietaria;

public class JPAUpdate {

	// Put entity manager here so it can be used in several methods
	private static EntityManager em;
	
	private static void printDepartments() {
		Query q1 = em.createNativeQuery("SELECT * FROM Propietaria", Propietaria.class);
		List<Propietaria> lista_propietarias = (List<Propietaria>) q1.getResultList();
		// Print the departments
		for (Propietaria propietaria : lista_propietarias) {
			System.out.println(propietaria);
		}
	}
	
	public static void main(String[] args) throws Exception {
		// Get the entity manager
		// Note that we are using the class' entity manager
		em = Persistence.createEntityManagerFactory("company-provider").createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("PRAGMA foreign_keys=ON").executeUpdate();
		em.getTransaction().commit();

		// Get the new department's location from the command prompt
		System.out.println("Company's departments:");
		printDepartments();
		System.out.print("Choose a department to change its location. Type it's ID:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int id_propietaria = Integer.parseInt(reader.readLine());
		Query q2 = em.createNativeQuery("SELECT * FROM Propietaria WHERE id_propietaria = ?", Propietaria.class);
		q2.setParameter(1, id_propietaria);
		Propietaria propietaria = (Propietaria) q2.getSingleResult();
		System.out.print("Type it's new location:");
		String direccion = reader.readLine();
		
		// Begin transaction
		em.getTransaction().begin();
		// Make changes
		propietaria.setDomicilio_propietaria(direccion);
		// End transaction
		em.getTransaction().commit();
		
		// Close the entity manager
		em.close();
	}
}

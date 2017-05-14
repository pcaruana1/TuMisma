package databaseJPA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tgi.project.Propietaria;;

public class JPADelete {

	// Put entity manager here so it can be used in several methods
	private static EntityManager em;

	private static void printPropietarias() {
		Query q1 = em.createNativeQuery("SELECT * FROM Propietaria", Propietaria.class);
		List<Propietaria> lista_propietarias = (List<Propietaria>) q1.getResultList();
		// Print the employees
		for (Propietaria p : lista_propietarias) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) throws Exception {
		// Get the entity manager
		// Note that we are using the class' entity manager
		em = Persistence.createEntityManagerFactory("company-provider").createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("PRAGMA foreign_keys=ON").executeUpdate();
		em.getTransaction().commit();

		
		System.out.println("Propietarias:");
		printPropietarias();
		System.out.print("Introduzca el ID de la propietaria que quiere borrar");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int id_propietaria = Integer.parseInt(reader.readLine());
		Query q2 = em.createNativeQuery("SELECT * FROM Propietaria WHERE id = ?", Propietaria.class);
		q2.setParameter(1, id_propietaria);
		Propietaria elegida = (Propietaria) q2.getSingleResult();

		// Begin transaction
		em.getTransaction().begin();
		// Store the object
		em.remove(elegida);
		// End transaction
		em.getTransaction().commit();

		// Close the entity manager
		em.close();
	}

}

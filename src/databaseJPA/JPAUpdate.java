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
	
	private static void printPropietarias() {
		Query q1 = em.createNativeQuery("SELECT * FROM propietaria", Propietaria.class);
		List<Propietaria> resultList = (List<Propietaria>) q1.getResultList();
		List<Propietaria> lista_propietarias = resultList;
		// Print propietarias
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

		System.out.println("Lista de propietarias:");
		printPropietarias();
		System.out.print("Introduzca el ID de la propietaria que desea modificar:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int id_propietaria = Integer.parseInt(reader.readLine());
		Query q2 = em.createNativeQuery("SELECT * FROM propietaria WHERE id_propietaria = ?", Propietaria.class);
		q2.setParameter(1, id_propietaria);
		Propietaria propietaria = (Propietaria) q2.getSingleResult();
		System.out.print("Introduzca su nueva direccion:");
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

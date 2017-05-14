package databaseJPA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tgi.project.Propietaria;

public class JPARead {

	public static void main(String[] args) throws Exception {
		// Get the entity manager
		EntityManager em = Persistence.createEntityManagerFactory("company-provider").createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("PRAGMA foreign_keys=ON").executeUpdate();
		em.getTransaction().commit();

		// Search in departments by name
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca el nombre de la propietaria: ");
		String name = reader.readLine();
		System.out.println("Matching propietarias:");
		Query q1 = em.createNativeQuery("SELECT * FROM Propietaria WHERE nombre_propietaria LIKE ?", Propietaria.class);
		q1.setParameter(1, "%" + name + "%");
		List<Propietaria> lista_propietarias = (List<Propietaria>) q1.getResultList();
		// Print the departments
		for (Propietaria propietaria : lista_propietarias) {
			System.out.println(propietaria);
		}
		
		// Get just one department
		// Only use this while looking by unique fields, if not,
		// you could get duplicate results
		System.out.print("Write the department's ID: ");
		int dep_id = Integer.parseInt(reader.readLine());
		Query q2 = em.createNativeQuery("SELECT * FROM Propietaria WHERE id_propietaria = ?", Propietaria.class);
		q2.setParameter(1, dep_id);
		Propietaria propietaria = (Propietaria) q2.getSingleResult();
		// Print the department
		System.out.println(propietaria);
		
		// Close the entity manager
		em.close();
	}

}

package databaseJPA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tgi.project.Propietaria;
import tgi.project.ContratoPropietaria;


public class JPAUpdateRelated {

	// Put entity manager and buffered reader here so it can be used
	// in several methods
	private static EntityManager em;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	// Used for parsing dates
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private static void printContratos() {
		Query q1 = em.createNativeQuery("SELECT * FROM Propietaria", Propietaria.class);
		List<Propietaria> lista_propietarias = (List<Propietaria>) q1.getResultList();
		// Print the departments
		for (Propietaria propietaria : lista_propietarias) {
			System.out.println(propietaria);
		}
	}

	private static Propietaria createPropietaria() throws Exception {
		// Get the employee info from the command prompt
		System.out.println("Porfavor, introduzca la información de la propietaria:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nombre: ");
		String name = reader.readLine();
		System.out.print("Cumpleaños (aaaa-MM-dd): ");
		String dob = reader.readLine();
		LocalDate dobDate = LocalDate.parse(dob, formatter);
		System.out.print("Direccion: ");
		String address = reader.readLine();
		System.out.print("Codigo Postal: ");
		double salary = Double.parseDouble(reader.readLine());
		System.out.print("DNI: ");
		String dni = reader.readLine();
		

		// Create the object
		Propietaria emp = new Propietaria();
		
		// Begin transaction
		em.getTransaction().begin();
		// Store the object
		em.persist(emp);
		// End transaction
		em.getTransaction().commit();
		
		// Return the Employee
		return emp;
	}

	public static void main(String[] args) throws Exception {
		// Get the entity manager
		// Note that we are using the class' entity manager
		em = Persistence.createEntityManagerFactory("company-provider").createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("PRAGMA foreign_keys=ON").executeUpdate();
		em.getTransaction().commit();

		// Create a propietaria
		Propietaria propietaria = createPropietaria();
		
		// Choose his new contract
		printContratos();
		System.out.print("Elige un contrato:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int ncontrato_propietaria = Integer.parseInt(reader.readLine());
		Query q2 = em.createNativeQuery("SELECT * FROM contrato_propietaria WHERE ncontrato_propietaria = ?", Propietaria.class);
		q2.setParameter(1, ncontrato_propietaria);
		ContratoPropietaria contrato = (ContratoPropietaria) q2.getSingleResult();

		// Assign employee to department
		// Begin transaction
		em.getTransaction().begin();
		// Make changes
		// Notice the double link
		contrato.setPropietaria(propietaria);
		propietaria.getLista_contratos().add(contrato);
		// End transaction
		em.getTransaction().commit();

		// Close the entity manager
		em.close();
	}
}

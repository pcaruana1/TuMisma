package tgi.project;


/**
 * ClientaAlquiler es cada clienta que alquila
 * 
 * @author Patricia Caruana 
 * @version 03/04/2017
 */
import java.time.LocalDate;
import java.util.ArrayList;

public class ClientaAlquiler
{
    // instance variables - replace the example below with your own
    private int id_clienta_alquiler;
    private String DNI_clienta_alquiler;
    private String nombre_clienta_alquiler;
    private String apellidos_clienta_alquiler;
    private String domicilio_clienta_alquiler;
    private int telefono_clienta_alquiler;
    private String email_clienta_alquiler;
    private LocalDate fecha_de_alta_clienta_alquiler;
    private int descuento_clienta_alquiler;
    private LocalDate fecha_de_nacimiento_clienta_alquiler;
    private ArrayList<Alquilar> lista_alquileres;

    /**
     * Constructor for objects of class ClientaAlquiler
     */
    
    
	public int getId_clienta_alquiler() {
		return id_clienta_alquiler;
	}

	public ClientaAlquiler(String dNI_clienta_alquiler,
			String nombre_clienta_alquiler, String apellidos_clienta_alquiler,
			String domicilio_clienta_alquiler, int telefono_clienta_alquiler,
			String email_clienta_alquiler,
			LocalDate fecha_de_alta_clienta_alquiler,
			int descuento_clienta_alquiler,
			LocalDate fecha_de_nacimiento_clienta_alquiler) {
		super();
		DNI_clienta_alquiler = dNI_clienta_alquiler;
		this.nombre_clienta_alquiler = nombre_clienta_alquiler;
		this.apellidos_clienta_alquiler = apellidos_clienta_alquiler;
		this.domicilio_clienta_alquiler = domicilio_clienta_alquiler;
		this.telefono_clienta_alquiler = telefono_clienta_alquiler;
		this.email_clienta_alquiler = email_clienta_alquiler;
		this.fecha_de_alta_clienta_alquiler = fecha_de_alta_clienta_alquiler;
		this.descuento_clienta_alquiler = descuento_clienta_alquiler;
		this.fecha_de_nacimiento_clienta_alquiler = fecha_de_nacimiento_clienta_alquiler;
	}

	public void setId_clienta_alquiler(int id_clienta_alquiler) {
		this.id_clienta_alquiler = id_clienta_alquiler;
	}

	public String getDNI_clienta_alquiler() {
		return DNI_clienta_alquiler;
	}

	public void setDNI_clienta_alquiler(String dNI_clienta_alquiler) {
		DNI_clienta_alquiler = dNI_clienta_alquiler;
	}

	public String getNombre_clienta_alquiler() {
		return nombre_clienta_alquiler;
	}

	public void setNombre_clienta_alquiler(String nombre_clienta_alquiler) {
		this.nombre_clienta_alquiler = nombre_clienta_alquiler;
	}

	public String getApellidos_clienta_alquiler() {
		return apellidos_clienta_alquiler;
	}

	public void setApellidos_clienta_alquiler(String apellidos_clienta_alquiler) {
		this.apellidos_clienta_alquiler = apellidos_clienta_alquiler;
	}

	public String getDomicilio_clienta_alquiler() {
		return domicilio_clienta_alquiler;
	}

	public void setDomicilio_clienta_alquiler(String domicilio_clienta_alquiler) {
		this.domicilio_clienta_alquiler = domicilio_clienta_alquiler;
	}

	public int getTelefono_clienta_alquiler() {
		return telefono_clienta_alquiler;
	}

	public void setTelefono_clienta_alquiler(int telefono_clienta_alquiler) {
		this.telefono_clienta_alquiler = telefono_clienta_alquiler;
	}

	public String getEmail_clienta_alquiler() {
		return email_clienta_alquiler;
	}

	public void setEmail_clienta_alquiler(String email_clienta_alquiler) {
		this.email_clienta_alquiler = email_clienta_alquiler;
	}

	public LocalDate getFecha_de_alta_clienta_alquiler() {
		return fecha_de_alta_clienta_alquiler;
	}

	public void setFecha_de_alta_clienta_alquiler(
			LocalDate fecha_de_alta_clienta_alquiler) {
		this.fecha_de_alta_clienta_alquiler = fecha_de_alta_clienta_alquiler;
	}

	public int getDescuento_clienta_alquiler() {
		return descuento_clienta_alquiler;
	}

	public void setDescuento_clienta_alquiler(int descuento_clienta_alquiler) {
		this.descuento_clienta_alquiler = descuento_clienta_alquiler;
	}

	public LocalDate getFecha_de_nacimiento_clienta_alquiler() {
		return fecha_de_nacimiento_clienta_alquiler;
	}

	public void setFecha_de_nacimiento_clienta_alquiler(
			LocalDate fecha_de_nacimiento_clienta_alquiler) {
		this.fecha_de_nacimiento_clienta_alquiler = fecha_de_nacimiento_clienta_alquiler;
	}

   
}


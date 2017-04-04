package tgi.project;


/**
 * Clase dependienta representa las trabajadoras de la tienda
 * 
 * @author Patricia Caruana
 * @version 03/04/2017
 */
public class Dependienta
{
    // instance variables - replace the example below with your own
    private int id_dependienta;
    private String DNI_dependienta;
    private String nombre_dependienta;
    private String apellidos_dependienta;

    /**
     * Constructor for objects of class Dependienta
     */
    public Dependienta(int id_dependienta, String DNI_dependienta, String nombre_dependienta, String apellidos_dependienta)
    {
        // initialise instance variables
        id_dependienta = id_dependienta;
        DNI_dependienta = DNI_dependienta;
        nombre_dependienta = nombre_dependienta;
        apellidos_dependienta = apellidos_dependienta;
    }

	public int getId_dependienta() {
		return id_dependienta;
	}

	public void setId_dependienta(int id_dependienta) {
		this.id_dependienta = id_dependienta;
	}

	public String getDNI_dependienta() {
		return DNI_dependienta;
	}

	public void setDNI_dependienta(String dNI_dependienta) {
		DNI_dependienta = dNI_dependienta;
	}

	public String getNombre_dependienta() {
		return nombre_dependienta;
	}

	public void setNombre_dependienta(String nombre_dependienta) {
		this.nombre_dependienta = nombre_dependienta;
	}

	public String getApellidos_dependienta() {
		return apellidos_dependienta;
	}

	public void setApellidos_dependienta(String apellidos_dependienta) {
		this.apellidos_dependienta = apellidos_dependienta;
	}

}


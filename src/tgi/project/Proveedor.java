package tgi.project;

/**
 * Proveedor representa a las tiendas donde se compran los artículos
 * 
 * @author Patricia Caruana 
 * @version 03/04/2017
 */

public class Proveedor
{
    // instance variables - replace the example below with your own
    private int id_proveedor;
    private String nombre_proveedor;
    private String ubicacion_proveedor;
    private String contacto;

    /**
     * Constructor for objects of class Proveedor
     */
    public Proveedor(int id_proveedor, String nombre_proveedor, String ubicacion_proveedor, String contacto)
    {
        // initialise instance variables
        id_proveedor = id_proveedor;
        nombre_proveedor = nombre_proveedor;
        ubicacion_proveedor = ubicacion_proveedor;
        contacto = contacto;
    }

	public int getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getNombre_proveedor() {
		return nombre_proveedor;
	}

	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}

	public String getUbicacion_proveedor() {
		return ubicacion_proveedor;
	}

	public void setUbicacion_proveedor(String ubicacion_proveedor) {
		this.ubicacion_proveedor = ubicacion_proveedor;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

    
    
}


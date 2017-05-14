package tgi.project;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Proveedor representa a las tiendas donde se compran los art�culos
 * 
 * @author  
 * @version 
 */

@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {

	private static final long serialVersionUID = -1104059400403823377L;

	@Id
	@GeneratedValue(generator = "proveedor")
	@TableGenerator(name = "proveedor", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "proveedor")
	
    private int id_proveedor;
	@OneToMany(mappedBy="proveedor")
    private ArrayList<ComprasProveedor> lista_compras_proveedor;
    private String nombre_proveedor;
    
	/**
	 * @return the lista_compras_proveedor
	 */
	public ArrayList<ComprasProveedor> getLista_compras_proveedor() {
	
		return lista_compras_proveedor;
	}

	
	/**
	 * @param lista_compras_proveedor the lista_compras_proveedor to set
	 */
	public void setLista_compras_proveedor(
			ArrayList<ComprasProveedor> lista_compras_proveedor) {
	
		this.lista_compras_proveedor = lista_compras_proveedor;
	}

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
    
    /**
     * Constructor sin parametros
     */  
    public Proveedor() {
		super();
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_proveedor;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Proveedor)) {
			return false;
		}
		Proveedor other = (Proveedor) obj;
		if (id_proveedor != other.id_proveedor) {
			return false;
		}
		return true;
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


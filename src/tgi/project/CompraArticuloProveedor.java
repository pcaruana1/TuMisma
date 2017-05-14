package tgi.project;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


/**
 * Write a description of class ComprasProveedorArticulo here.
 * 
 * @author
 * @version 
 */

@Entity
@Table(name = "compraArticuloProveedor")
public class CompraArticuloProveedor implements Serializable {

	private static final long serialVersionUID = 4085907571962996969L;

	@Id
	@GeneratedValue(generator = "compraArticuloProveedor")
	@TableGenerator(name = "compraArticuloProveedor", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "compraArticuloProveedor")
	
	private int id_ticket;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ticket")
    private ComprasProveedor nref_tienda_proveedor;
    private int precio_unidad;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nref_articulo")
    private Articulo articulo;

    
	/**
	 * @return the articulo
	 */
	public Articulo getArticulo() {
	
		return articulo;
	}

	
	/**
	 * @param articulo the articulo to set
	 */
	public void setArticulo(Articulo articulo) {
	
		this.articulo = articulo;
	}

	/**
     * Constructor for objects of class ComprasProveedorArticulo
     */
    public CompraArticuloProveedor(int id_ticket, int nref_tienda_proveedor, int precio_unidad,
    int nref_articulo)
    {
        // initialise instance variables
        id_ticket= id_ticket;
        nref_tienda_proveedor = nref_tienda_proveedor;
        precio_unidad = precio_unidad; 
        nref_articulo = nref_articulo;
    }
    
    /**
     * Constructor sin parametros
     */  
    public CompraArticuloProveedor() {
		super();
    }
    

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_ticket;
		result = prime
				* result
				+ ((nref_tienda_proveedor == null) ? 0 : nref_tienda_proveedor
						.hashCode());
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
		if (!(obj instanceof CompraArticuloProveedor)) {
			return false;
		}
		CompraArticuloProveedor other = (CompraArticuloProveedor) obj;
		if (id_ticket != other.id_ticket) {
			return false;
		}
		if (nref_tienda_proveedor == null) {
			if (other.nref_tienda_proveedor != null) {
				return false;
			}
		} else if (!nref_tienda_proveedor.equals(other.nref_tienda_proveedor)) {
			return false;
		}
		return true;
	}
	

	public int getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}

	public int getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(int precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	
	/**
	 * @return the nref_tienda_proveedor
	 */
	public ComprasProveedor getNref_tienda_proveedor() {
	
		return nref_tienda_proveedor;
	}

	
	/**
	 * @param nref_tienda_proveedor the nref_tienda_proveedor to set
	 */
	public void setNref_tienda_proveedor(ComprasProveedor nref_tienda_proveedor) {
	
		this.nref_tienda_proveedor = nref_tienda_proveedor;
	}
	
   
}


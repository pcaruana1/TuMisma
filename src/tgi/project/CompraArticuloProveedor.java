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
 * Esta clase tiene clave compuesta
 * 1) CompraProveedor (id_ticket)
 * 2) Articulo (n_ref)
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ticket")
    private ComprasProveedor ticket_compra;
    private int precio_unidad;
    @Id
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
		result = prime * result + ticket_compra.getId_ticket();
		result = prime
				* result
				+ ((ticket_compra == null) ? 0 : ticket_compra.hashCode());
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
		if (ticket_compra != other.ticket_compra) {
			return false;
		}
		if (ticket_compra == null) {
			if (other.ticket_compra != null) {
				return false;
			}
		} else if (!ticket_compra.equals(other.ticket_compra)) {
			return false;
		}
		return true;
	}
	

	public int getId_ticket() {
		return ticket_compra.getId_ticket();
	}

	public void setId_ticket(int ticket_compra) {
		this.ticket_compra.setId_ticket(ticket_compra); 
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
	
		return ticket_compra;
	}

	
	/**
	 * @param nref_tienda_proveedor the nref_tienda_proveedor to set
	 */
	public void setNref_tienda_proveedor(ComprasProveedor nref_tienda_proveedor) {
	
		this.ticket_compra = nref_tienda_proveedor;
	}
	
   
}


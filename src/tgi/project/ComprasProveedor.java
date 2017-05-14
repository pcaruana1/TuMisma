package tgi.project;


/**
 * Write a description of class ComprasProveedor here.
 * 
 * @author 
 * @version 
 */
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "comprasProveedor")
public class ComprasProveedor implements Serializable {

	private static final long serialVersionUID = -1145215861950206741L;

	@Id
	@GeneratedValue(generator = "comprasProveedor")
	@TableGenerator(name = "comprasProveedor", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "comprasProveedor")
	
    private int id_ticket;
    private int precio_final;
    private LocalDate fecha_compra;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;
	@OneToMany(mappedBy="nref_tienda_proveedor")
    private ArrayList<CompraArticuloProveedor> lista_compra_art_proveedor;
	
	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
	
		return proveedor;
	}

	
	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
	
		this.proveedor = proveedor;
	}

	
	/**
	 * @return the lista_compra_art_proveedor
	 */
	public ArrayList<CompraArticuloProveedor> getLista_compra_art_proveedor() {
	
		return lista_compra_art_proveedor;
	}

	
	/**
	 * @param lista_compra_art_proveedor the lista_compra_art_proveedor to set
	 */
	public void setLista_compra_art_proveedor(
			ArrayList<CompraArticuloProveedor> lista_compra_art_proveedor) {
	
		this.lista_compra_art_proveedor = lista_compra_art_proveedor;
	}

	
	/**
	 * @return the lista_art_comprados
	 */
	public ArrayList<Articulo> getLista_art_comprados() {
	
		return lista_art_comprados;
	}

	
	/**
	 * @param lista_art_comprados the lista_art_comprados to set
	 */
	public void setLista_art_comprados(ArrayList<Articulo> lista_art_comprados) {
	
		this.lista_art_comprados = lista_art_comprados;
	}

	@OneToMany(mappedBy="compra_proveedor")
    private ArrayList<Articulo> lista_art_comprados;
	
    
    /**
     * Constructor for objects of class ComprasProveedor
     */
    public ComprasProveedor(int id_ticket, int id_proveedor, int precio_final,
    LocalDate fecha_compra)
    {
        // initialise instance variables
       id_ticket= id_ticket;
       id_proveedor = id_proveedor;
       precio_final = precio_final;
       fecha_compra = fecha_compra;
    }
    
	public ComprasProveedor(int id_ticket, int id_proveedor, int precio_final,
			LocalDate fecha_compra,
			ArrayList<Articulo> lista_art_comprados, Proveedor proveedor) {
		super();
		this.id_ticket = id_ticket;		
		this.precio_final = precio_final;
		this.fecha_compra = fecha_compra;
		this.lista_art_comprados = lista_art_comprados;
		this.proveedor = proveedor;
	}
	
    /**
     * Constructor sin parametros
     */  
    public ComprasProveedor() {
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
		if (!(obj instanceof ComprasProveedor)) {
			return false;
		}
		ComprasProveedor other = (ComprasProveedor) obj;
		if (id_ticket != other.id_ticket) {
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

	public int getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(int precio_final) {
		this.precio_final = precio_final;
	}

	public LocalDate getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(LocalDate fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

    
    
}


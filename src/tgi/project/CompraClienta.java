package tgi.project;

import java.util.ArrayList;
import java.io.Serializable;
import java.time.LocalDate; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Compra")
public class CompraClienta implements Serializable {

	private static final long serialVersionUID = -9120638605277671481L;

	@Id
	@GeneratedValue(generator = "compraClienta")
	@TableGenerator(name = "compraClienta", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "compraClienta")
	
	private int id_compra;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nref_articulo")
    private Articulo articulo;
    private LocalDate fecha_venta;

    /**
     * Constructor for objects of class Compra
     */
    public CompraClienta(int id_compra, int nref_articulo, LocalDate fecha_venta) {
        // initialise instance variables
       id_compra=id_compra;
       fecha_venta=fecha_venta;

    }
    
    /**
     * Constructor sin parametros
     */  
    public CompraClienta() {
		super();
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_compra;
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
		if (!(obj instanceof CompraClienta)) {
			return false;
		}
		CompraClienta other = (CompraClienta) obj;
		if (id_compra != other.id_compra) {
			return false;
		}
		return true;
	}
	
	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	
	public LocalDate getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDate fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

    
    
}


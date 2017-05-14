package tgi.project;

import java.io.Serializable;
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
@Table(name = "contrato_articulo")
public class ContratoPropietariaArticulo implements Serializable {

	private static final long serialVersionUID = 744810596113482316L;

	@Id
	@GeneratedValue(generator = "contratoPropietariaArticulo")
	@TableGenerator(name = "contratoPropietariaArticulo", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "contratoPropietariaArticulo")
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nref_articulo")
	private Articulo articulo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ncontrato_propietaria")
	private ContratoPropietaria contrato;
	private int precio_tasacion;
	private int precio_alquiler;
	
	
	public ContratoPropietariaArticulo(Articulo articulo, int precio_tasacion) {
		super();
		this.articulo = articulo;
		this.precio_tasacion = precio_tasacion;
	}


	public ContratoPropietariaArticulo(Articulo articulo,
			ContratoPropietaria contrato, int precio_tasacion) {
		super();
		this.articulo = articulo;
		this.contrato = contrato;
		this.precio_tasacion = precio_tasacion;
	}


	public ContratoPropietariaArticulo(Articulo articulo,
			ContratoPropietaria contrato, int precio_tasacion, int precio_alquiler) {
		super();
		this.articulo = articulo;
		this.contrato = contrato;
		this.precio_tasacion = precio_tasacion;
		this.precio_alquiler = precio_alquiler;
	}

    /**
     * Constructor sin parametros
     */  
    public ContratoPropietariaArticulo() {
		super();
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((articulo == null) ? 0 : articulo.hashCode());
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
		if (!(obj instanceof ContratoPropietariaArticulo)) {
			return false;
		}
		ContratoPropietariaArticulo other = (ContratoPropietariaArticulo) obj;
		if (articulo == null) {
			if (other.articulo != null) {
				return false;
			}
		} else if (!articulo.equals(other.articulo)) {
			return false;
		}
		return true;
	}


	public Articulo getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


	public ContratoPropietaria getContrato() {
		return contrato;
	}


	public void setContrato(ContratoPropietaria contrato) {
		this.contrato = contrato;
	}


	public int getPrecio_tasacion() {
		return precio_tasacion;
	}


	public void setPrecio_tasacion(int precio_tasacion) {
		this.precio_tasacion = precio_tasacion;
	}


	public int getPrecio_alquiler() {
		return precio_alquiler;
	}


	public void setPrecio_alquiler(int precio_alquiler) {
		this.precio_alquiler = precio_alquiler;
	}
	

	
}
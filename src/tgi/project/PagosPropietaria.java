package tgi.project;


/**
 * Write a description of class PagosPropietaria here.
 * 
 * @author 
 * @version 
 */
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

//ROOT ELEMENT QUE GENERE LOS PAGOS. LA PROPIETARIA EXISTE SI O SI
@Entity
@Table(name = "pagosPropietaria")
public class PagosPropietaria implements Serializable {

	private static final long serialVersionUID = -6954563533640681418L;

	@Id
	@GeneratedValue(generator = "pagosPropietaria")
	@TableGenerator(name = "pagosPropietaria", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "pagosPropietaria")
	
    private int id_pago;	//AT
    private int dinero;		//EL	
    private int forma_pago;	//AT
    private LocalDate fecha_pago;	//EL
    private boolean pagado;		//AT
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_propietaria")
    private Propietaria propietaria;
	@OneToMany(mappedBy="pago")
    private List<Alquilar> lista_alquileres = new ArrayList<Alquilar>();	//TR
    
    
    /**
     * Constructor for objects of class PagosPropietaria
     */

	public PagosPropietaria(int id_pago, int id_propietaria, int dinero,
			int forma_pago, LocalDate fecha_pago, boolean pagado) {
		this.id_pago = id_pago;
		this.propietaria.setId_propietaria(id_propietaria); 
		this.dinero = dinero;
		this.forma_pago = forma_pago;
		this.fecha_pago = fecha_pago;
		this.pagado = pagado;
	}

	
	public PagosPropietaria(int id_pago, int id_propietaria, int dinero,
			int forma_pago, LocalDate fecha_pago, boolean pagado,
			ArrayList<Alquilar> lista_alquileres) {
		super();
		this.id_pago = id_pago;
		this.propietaria.setId_propietaria(id_propietaria); 
		this.dinero = dinero;
		this.forma_pago = forma_pago;
		this.fecha_pago = fecha_pago;
		this.pagado = pagado;
		this.lista_alquileres = lista_alquileres;
	}
	
    /**
     * Constructor sin parametros
     */  
    public PagosPropietaria() {
		super();
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_pago;
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
		if (!(obj instanceof PagosPropietaria)) {
			return false;
		}
		PagosPropietaria other = (PagosPropietaria) obj;
		if (id_pago != other.id_pago) {
			return false;
		}
		return true;
	}

	public int getId_pago() {
		return id_pago;
	}
	
	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}

	public int getId_propietaria() {
		return this.propietaria.getId_propietaria(); 
	}

	public void setId_propietaria(int id_propietaria) {
		this.propietaria.setId_propietaria(id_propietaria); 
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(int forma_pago) {
		this.forma_pago = forma_pago;
	}

	public LocalDate getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(LocalDate fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

    
    
}


package tgi.project;


/**
 * Alquilar refleja los datos en relacion con el alquiler de articulos
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "alquilar")
public class Alquilar implements Serializable {

	private static final long serialVersionUID = -179884453350626228L;
	
	@Id
	@GeneratedValue(generator = "alquilar")
	@TableGenerator(name = "alquilar", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "alquilar")
	
	private int id_alquiler;
    private LocalDate fecha_recogida;
    private LocalDate fecha_devolucion;
    private int seguro;
    private String codigo_descuento;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pago")
    private PagosPropietaria pago;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nref_articulo")
    private Articulo articulo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_clienta_alquiler")
    private ClientaAlquiler clienta;
    
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquilar(int id_alquiler, int id_pago, int  nref_articulo,
    int id_clienta_alquiler, LocalDate fecha_recogida,
    LocalDate fecha_devolucion, int seguro, String codigo_descuento) {
        // initialise instance variables
        id_alquiler = id_alquiler;
        id_pago = id_pago;
        id_alquiler = id_alquiler;
        id_clienta_alquiler = id_clienta_alquiler;
        fecha_recogida = fecha_recogida;
        fecha_devolucion = fecha_devolucion;
        seguro = seguro;
        codigo_descuento = codigo_descuento;
    }
    
    /**
     * Constructor sin parametros
     */  
    public Alquilar() {
		super();
	}
    

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_alquiler;
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
		if (!(obj instanceof Alquilar)) {
			return false;
		}
		Alquilar other = (Alquilar) obj;
		if (id_alquiler != other.id_alquiler) {
			return false;
		}
		return true;
	}

	public int getId_alquiler() {
		return id_alquiler;
	}

	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}

	
	public int getNref_articulo() {
		return articulo.getNref_articulo();
	}

	public void setNref_articulo(int nref_articulo) {
		this.articulo.getNref_articulo();
	}

	
	public LocalDate getFecha_recogida() {
		return fecha_recogida;
	}

	public void setFecha_recogida(LocalDate fecha_recogida) {
		this.fecha_recogida = fecha_recogida;
	}

	public LocalDate getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setFecha_devolucion(LocalDate fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}

	public int getSeguro() {
		return seguro;
	}

	public void setSeguro(int seguro) {
		this.seguro = seguro;
	}

	public String getCodigo_descuento() {
		return codigo_descuento;
	}

	public void setCodigo_descuento(String codigo_descuento) {
		this.codigo_descuento = codigo_descuento;
	}

   
   
}


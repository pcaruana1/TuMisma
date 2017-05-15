package tgi.project;

import java.io.Serializable;
import java.util.ArrayList;
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

/**
 * Esta clase representa los articulos del inventario de la tienda
 * 
 * @author  
 * @version 
 */

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

	private static final long serialVersionUID = -1319238832944476165L;
	
	@Id
	@GeneratedValue(generator = "articulo")
	@TableGenerator(name = "articulo", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "articulo")
	
	private int nref_articulo;
    private String designer;
    private String tipo_articulo;
    private boolean disponibilidad;
    private int talla;
    private String color;
    private int fianza;
    private int precioAlquiler;
    private int precioVenta;
    private String imagen;
    private String comentarios;
	@OneToOne(mappedBy="articulo")
    private ContratoPropietariaArticulo contrato_prop_art;
	@OneToOne(mappedBy="articulo")
    private CompraArticuloProveedor compra_art_proveedor;
	@OneToOne(mappedBy="articulo")
	private CompraClienta compra;
	@OneToMany(mappedBy="articulo")
    private ArrayList<Alquilar> lista_alquileres = new ArrayList<Alquilar>();

    /**
     * Constructor general de Articulo
     */
    
    public Articulo(int nref_articulo, String designer, String tipo_articulo, 
    boolean disponibilidad, int talla, String color, int fianza, int precioAlquiler,
    int precioVenta, String imagen, String comentarios)
    {
      this.nref_articulo = nref_articulo;
      this.designer = designer;
      this.tipo_articulo = tipo_articulo;
      this.disponibilidad = disponibilidad;
      this.talla = talla;
      this.color = color;
      this.fianza = fianza;
      this.precioAlquiler = precioAlquiler;
      this.precioVenta = precioVenta;
      this.imagen = imagen;
      this.comentarios = comentarios;
    }

    /**
     * Constructor sin parametros
     */  
    public Articulo() {
		super();
    }
    
     //Constructor de articulo comprado
	public Articulo(int nref_articulo, String designer,
			String tipo_articulo, boolean disponibilidad, int talla,
			String color, int fianza, int precioAlquiler, int precioVenta,
			String imagen, String comentarios, CompraArticuloProveedor compra_art_proveedor) {
		this.nref_articulo = nref_articulo;
		this.designer = designer;
		this.tipo_articulo = tipo_articulo;
		this.disponibilidad = disponibilidad;
		this.talla = talla;
		this.color = color;
		this.fianza = fianza;
		this.precioAlquiler = precioAlquiler;
		this.precioVenta = precioVenta;
		this.imagen = imagen;
		this.comentarios = comentarios;
		this.compra_art_proveedor = compra_art_proveedor;
	}

	
	/**
	 * @return the compra_art_proveedor
	 */
	public CompraArticuloProveedor getCompra_art_proveedor() {
	
		return compra_art_proveedor;
	}

	
	/**
	 * @param compra_art_proveedor the compra_art_proveedor to set
	 */
	public void setCompra_art_proveedor(CompraArticuloProveedor compra_art_proveedor) {
	
		this.compra_art_proveedor = compra_art_proveedor;
	}

	public Articulo(int nref_articulo) {
		this.nref_articulo = nref_articulo;
	}

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nref_articulo;
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
		if (!(obj instanceof Articulo)) {
			return false;
		}
		Articulo other = (Articulo) obj;
		if (nref_articulo != other.nref_articulo) {
			return false;
		}
		return true;
	}


	public int getNref_articulo() {
		return nref_articulo;
	}

	public void setNref_articulo(int nref_articulo) {
		this.nref_articulo = nref_articulo;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getTipo_articulo() {
		return tipo_articulo;
	}

	public void setTipo_articulo(String tipo_articulo) {
		this.tipo_articulo = tipo_articulo;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFianza() {
		return fianza;
	}

	public void setFianza(int fianza) {
		this.fianza = fianza;
	}

	public int getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(int precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public ContratoPropietariaArticulo getContrato() {
		return contrato_prop_art;
	}

	public void setContrato(ContratoPropietariaArticulo contrato) {
		this.contrato_prop_art = contrato;
	}

	public ArrayList<Alquilar> getLista_alquileres() {
		return lista_alquileres;
	}

	public void setLista_alquileres(ArrayList<Alquilar> lista_alquileres) {
		this.lista_alquileres = lista_alquileres;
	}

}
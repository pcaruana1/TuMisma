package tgi.project;

/**
 * Contrato entre la propietaria del articulo y la tienda
 * 
 * @author 
 * @version 
 */
import java.io.Serializable;
import java.time.LocalDate; 
import java.util.ArrayList;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Entity
@Table(name = "contratoPropietaria")
public class ContratoPropietaria implements Serializable {

	private static final long serialVersionUID = -7839249403410865448L;

	@Id
	@GeneratedValue(generator = "contratoPropietaria")
	@TableGenerator(name = "contratoPropietaria", table = "sqlite_sequence",
		pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "contratoPropietaria")
	
    private int ncontrato_propietaria;
	@Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate fecha_de_contrato;
	@Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate fecha_fin_de_contrato;
    private int nrenovaciones_contrato;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_propietaria")
    private Propietaria propietaria;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato")
    private ArrayList<ContratoPropietariaArticulo> lista_articulos = new ArrayList<>();
    
    /**
     * Constructor for objects of class Contrato
     */   
    
	public ContratoPropietaria(int ncontrato_propietaria,Propietaria propietaria, int nrenovaciones) {
		super();
		this.ncontrato_propietaria = ncontrato_propietaria;
		this.nrenovaciones_contrato = nrenovaciones;
		this.propietaria = propietaria;
	}
	
	public ContratoPropietaria(Propietaria propietaria, int nrenovaciones) {
		super();
		
		this.nrenovaciones_contrato = nrenovaciones;
		this.propietaria = propietaria;
	}
	
		
	public ContratoPropietaria(int ncontrato_propietaria,
			LocalDate fecha_de_contrato,
			LocalDate fecha_fin_de_contrato,
			int nrenovaciones_contrato, Propietaria propietaria,
			ArrayList<ContratoPropietariaArticulo> lista_articulos) {
		this.ncontrato_propietaria = ncontrato_propietaria;
		this.fecha_de_contrato = fecha_de_contrato;
		this.fecha_fin_de_contrato = fecha_fin_de_contrato;
		this.nrenovaciones_contrato = nrenovaciones_contrato;
		this.propietaria = propietaria;
		this.lista_articulos = lista_articulos;
	}


	public ContratoPropietaria(int ncontrato_propietaria, Propietaria propietaria, int nrenovaciones_contrato,
			LocalDate fecha_de_contrato, LocalDate fecha_fin_de_contrato) {
		super();
		this.ncontrato_propietaria = ncontrato_propietaria;
		this.fecha_de_contrato = fecha_de_contrato;
		this.fecha_fin_de_contrato = fecha_fin_de_contrato;
		this.nrenovaciones_contrato = nrenovaciones_contrato;
		this.propietaria = propietaria;
	}
	
    /**
     * Constructor sin parametros
     */  
    public ContratoPropietaria() {
		super();
    }

    /* (non-Javadoc)
 	 * @see java.lang.Object#hashCode()
 	 */
 	@Override
 	public int hashCode() {
 		final int prime = 31;
 		int result = 1;
 		result = prime * result + ncontrato_propietaria;
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
 		if (!(obj instanceof ContratoPropietaria)) {
 			return false;
 		}
 		ContratoPropietaria other = (ContratoPropietaria) obj;
 		if (ncontrato_propietaria != other.ncontrato_propietaria) {
 			return false;
 		}
 		return true;
 	}


	public int getNcontrato_propietaria() {
		return ncontrato_propietaria;
	}


	public void setNcontrato_propietaria(int ncontrato_propietaria) {
		this.ncontrato_propietaria = ncontrato_propietaria;
	}


	public LocalDate getFecha_de_contrato() {
		return fecha_de_contrato;
	}


	public void setFecha_de_contrato(LocalDate fecha_de_contrato) {
		this.fecha_de_contrato = fecha_de_contrato;
	}


	public LocalDate getFecha_fin_de_contrato() {
		return fecha_fin_de_contrato;
	}


	public void setFecha_fin_de_contrato(LocalDate fecha_fin_de_contrato) {
		this.fecha_fin_de_contrato = fecha_fin_de_contrato;
	}


	public int getNrenovaciones_contrato() {
		return nrenovaciones_contrato;
	}


	public void setNrenovaciones_contrato(int nrenovaciones_contrato) {
		this.nrenovaciones_contrato = nrenovaciones_contrato;
	}


	public Propietaria getPropietaria() {
		return propietaria;
	}


	public void setPropietaria(Propietaria propietaria) {
		this.propietaria = propietaria;
	}


	public ArrayList<ContratoPropietariaArticulo> getLista_articulos() {
		return lista_articulos;
	}


	public void setLista_articulos(
			ArrayList<ContratoPropietariaArticulo> lista_articulos) {
		this.lista_articulos = lista_articulos;
	}

	
	
}

	
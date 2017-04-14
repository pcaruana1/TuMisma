package tgi.project;

/**
 * Contrato entre la propietaria del articulo y la tienda
 * 
 * @author Patricia Caruana 
 * @version 04/04/2017
 */
import java.time.LocalDate; 
import java.util.ArrayList;
public class ContratoPropietaria
{
    // instance variables - replace the example below with your own
    private int ncontrato_propietaria;
    private LocalDate fecha_de_contrato;
    private LocalDate fecha_fin_de_contrato;
    private int nrenovaciones_contrato;
    private Propietaria propietaria;
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


	public ContratoPropietaria() {
		// TODO Auto-generated constructor stub
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

	
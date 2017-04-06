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
    private int id_propietaria;
    private LocalDate fecha_de_contrato;
    private LocalDate fecha_fin_de_contrato;
    private String nrenovaciones_contrato;
    private Propietaria propietaria;
    private ArrayList<Articulo> lista_articulos;
    /**
     * Constructor for objects of class Contrato
     */   
	public ContratoPropietaria(int ncontrato_propietaria, int id_propietaria,
			LocalDate fecha_de_contrato,
			LocalDate fecha_fin_de_contrato,
			String nrenovaciones_contrato, Propietaria propietaria) {
		super();
		this.ncontrato_propietaria = ncontrato_propietaria;
		this.id_propietaria = id_propietaria;
		this.fecha_de_contrato = fecha_de_contrato;
		this.fecha_fin_de_contrato = fecha_fin_de_contrato;
		this.nrenovaciones_contrato = nrenovaciones_contrato;
		this.propietaria = propietaria;
	}
	
		
	public ContratoPropietaria(int ncontrato_propietaria, int id_propietaria,
			LocalDate fecha_de_contrato,
			LocalDate fecha_fin_de_contrato,
			String nrenovaciones_contrato, Propietaria propietaria,
			ArrayList<Articulo> lista_articulos) {
		this.ncontrato_propietaria = ncontrato_propietaria;
		this.id_propietaria = id_propietaria;
		this.fecha_de_contrato = fecha_de_contrato;
		this.fecha_fin_de_contrato = fecha_fin_de_contrato;
		this.nrenovaciones_contrato = nrenovaciones_contrato;
		this.propietaria = propietaria;
		this.lista_articulos = lista_articulos;
	}



	public int getNcontrato_propietaria() {
		return ncontrato_propietaria;
	}
	public void setNcontrato_propietaria(int ncontrato_propietaria) {
		this.ncontrato_propietaria = ncontrato_propietaria;
	}

	public int getId_propietaria() {
		return id_propietaria;
	}

	public void setId_propietaria(int id_propietaria) {
		this.id_propietaria = id_propietaria;
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

	public String getNrenovaciones_contrato() {
		return nrenovaciones_contrato;
	}

	public void setNrenovaciones_contrato(String nrenovaciones_contrato) {
		this.nrenovaciones_contrato = nrenovaciones_contrato;
	}

    
    
}

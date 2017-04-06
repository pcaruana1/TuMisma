package tgi.project;


/**
 * Write a description of class PagosPropietaria here.
 * 
 * @author Patricia Caruana 
 * @version 04/04/2017
 */
import java.time.LocalDate;
import java.util.ArrayList;
public class PagosPropietaria
{
    // instance variables - replace the example below with your own
    private int id_pago;
    private int id_propietaria;
    private int dinero;
    private int forma_pago;
    private LocalDate fecha_pago;
    private boolean pagado;
    private ArrayList<Alquilar> lista_alquileres;
    
    /**
     * Constructor for objects of class PagosPropietaria
     */
    

	public PagosPropietaria(int id_pago, int id_propietaria, int dinero,
			int forma_pago, tgi.project.LocalDate fecha_pago, boolean pagado) {
		this.id_pago = id_pago;
		this.id_propietaria = id_propietaria;
		this.dinero = dinero;
		this.forma_pago = forma_pago;
		this.fecha_pago = fecha_pago;
		this.pagado = pagado;
	}

	
	public PagosPropietaria(int id_pago, int id_propietaria, int dinero,
			int forma_pago, tgi.project.LocalDate fecha_pago, boolean pagado,
			ArrayList<Alquilar> lista_alquileres) {
		super();
		this.id_pago = id_pago;
		this.id_propietaria = id_propietaria;
		this.dinero = dinero;
		this.forma_pago = forma_pago;
		this.fecha_pago = fecha_pago;
		this.pagado = pagado;
		this.lista_alquileres = lista_alquileres;
	}



	public int getId_pago() {
		return id_pago;
	}
	
	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}

	public int getId_propietaria() {
		return id_propietaria;
	}

	public void setId_propietaria(int id_propietaria) {
		this.id_propietaria = id_propietaria;
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


package tgi.project;


/**
 * Alquilar relfeja los datos en relacion con el alquiler de articulos
 * 
 * @author Patricia Caruana 
 * @version 04/04/2017
 */
import java.time.LocalDate;

public class Alquilar
{
    // instance variables - replace the example below with your own
    //hola soy maria
	private int id_alquiler;
    private int id_pago;
    private int nref_articulo;
    private int id_dependienta;
    private int id_clienta_alquiler;
    private LocalDate fecha_recogida;
    private LocalDate fecha_devolucion;
    private int seguro;
    private String codigo_descuento;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquilar(int id_alquiler, int id_pago, int  nref_articulo,
    int id_dependienta, int id_clienta_alquiler, LocalDate fecha_recogida,
    LocalDate fecha_devolucion, int seguro, String codigo_descuento)
    {
        // initialise instance variables
        id_alquiler = id_alquiler;
        id_pago = id_pago;
        id_alquiler = id_alquiler;
        id_dependienta = id_dependienta;
        id_clienta_alquiler = id_clienta_alquiler;
        fecha_recogida = fecha_recogida;
        fecha_devolucion = fecha_devolucion;
        seguro = seguro;
        codigo_descuento = codigo_descuento;
    }

	public int getId_alquiler() {
		return id_alquiler;
	}

	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}

	public int getId_pago() {
		return id_pago;
	}

	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}

	public int getNref_articulo() {
		return nref_articulo;
	}

	public void setNref_articulo(int nref_articulo) {
		this.nref_articulo = nref_articulo;
	}

	public int getId_dependienta() {
		return id_dependienta;
	}

	public void setId_dependienta(int id_dependienta) {
		this.id_dependienta = id_dependienta;
	}

	public int getId_clienta_alquiler() {
		return id_clienta_alquiler;
	}

	public void setId_clienta_alquiler(int id_clienta_alquiler) {
		this.id_clienta_alquiler = id_clienta_alquiler;
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


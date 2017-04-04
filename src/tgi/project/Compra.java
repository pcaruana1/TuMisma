package tgi.project;

public class Compra {

}
/**
 * Write a description of class Compra here.
 * 
 * @author Patricia Caruana
 * @version 04/04/2017
 */
import java.time.LocalDate; 

public class Compra
{
    // instance variables - replace the example below with your own
    private int id_compra;
    private int nref_articulo;
    private int id_dependienta;
    private LocalDate fecha_venta;

    /**
     * Constructor for objects of class Compra
     */
    public Compra(int id_compra, int nref_articulo, int id_dependienta, LocalDate fecha_venta)
    {
        // initialise instance variables
       id_compra=id_compra;
       nref_articulo=nref_articulo;
       id_dependienta=id_dependienta;
       fecha_venta=fecha_venta;

    }

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
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

	public LocalDate getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDate fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

    
    
}


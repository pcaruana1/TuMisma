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
    private ArrayList<Articulo> lista_articulos;
    private LocalDate fecha_venta;

    /**
     * Constructor for objects of class Compra
     */
    public Compra(int id_compra, int nref_articulo, LocalDate fecha_venta)
    {
        // initialise instance variables
       id_compra=id_compra;
       fecha_venta=fecha_venta;

    }

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	
	public LocalDate getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDate fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

    
    
}


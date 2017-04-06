package tgi.project;

import java.util.ArrayList;

import java.time.LocalDate; 

public class ComprasArticulo
{
    // instance variables - replace the example below with your own
    private int id_compra;
    private ArrayList<Articulo> lista_articulos;
    private LocalDate fecha_venta;

    /**
     * Constructor for objects of class Compra
     */
    public ComprasArticulo(int id_compra, int nref_articulo, LocalDate fecha_venta)
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


package tgi.project;


/**
 * Write a description of class ComprasProveedorArticulo here.
 * 
 * @author Patricia Caruana 
 * @version 04/04/2017
 */
public class ComprasProveedorArticulo
{
    // instance variables - replace the example below with your own
    private int id_ticket;
    private int nref_tienda_proveedor;
    private int precio_unidad;
    private int nref_articulo;

    /**
     * Constructor for objects of class ComprasProveedorArticulo
     */
    public ComprasProveedorArticulo(int id_ticket, int nref_tienda_proveedor, int precio_unidad,
    int nref_articulo)
    {
        // initialise instance variables
        id_ticket= id_ticket;
        nref_tienda_proveedor = nref_tienda_proveedor;
        precio_unidad = precio_unidad; 
        nref_articulo = nref_articulo;
    }

	public int getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}

	public int getNref_tienda_proveedor() {
		return nref_tienda_proveedor;
	}

	public void setNref_tienda_proveedor(int nref_tienda_proveedor) {
		this.nref_tienda_proveedor = nref_tienda_proveedor;
	}

	public int getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(int precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public int getNref_articulo() {
		return nref_articulo;
	}

	public void setNref_articulo(int nref_articulo) {
		this.nref_articulo = nref_articulo;
	}

    
   
}


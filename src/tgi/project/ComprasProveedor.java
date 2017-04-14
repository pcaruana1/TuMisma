package tgi.project;


/**
 * Write a description of class ComprasProveedor here.
 * 
 * @author Patricia Caruana
 * @version 04/04/2017
 */
import java.time.LocalDate;
import java.util.ArrayList;
public class ComprasProveedor
{
    // instance variables - replace the example below with your own
    private int id_ticket;
    private int precio_final;
    private LocalDate fecha_compra;
    private ArrayList<Articulo> lista_art_comprados;
    private Proveedor proveedor;
    
    /**
     * Constructor for objects of class ComprasProveedor
     */
    public ComprasProveedor(int id_ticket, int id_proveedor, int precio_final,
    LocalDate fecha_compra)
    {
        // initialise instance variables
       id_ticket= id_ticket;
       id_proveedor = id_proveedor;
       precio_final = precio_final;
       fecha_compra = fecha_compra;
    }
    
	public ComprasProveedor(int id_ticket, int id_proveedor, int precio_final,
			LocalDate fecha_compra,
			ArrayList<Articulo> lista_art_comprados, Proveedor proveedor) {
		super();
		this.id_ticket = id_ticket;		
		this.precio_final = precio_final;
		this.fecha_compra = fecha_compra;
		this.lista_art_comprados = lista_art_comprados;
		this.proveedor = proveedor;
	}

	public int getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}

	public int getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(int precio_final) {
		this.precio_final = precio_final;
	}

	public LocalDate getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(LocalDate fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

    
    
}


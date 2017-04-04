package tgi.project;


/**
 * Write a description of class ComprasProveedor here.
 * 
 * @author Patricia Caruana
 * @version 04/04/2017
 */
import java.time.LocalDate;
public class ComprasProveedor
{
    // instance variables - replace the example below with your own
    private int id_ticket;
    private int id_proveedor;
    private int precio_final;
    private LocalDate fecha_compra;

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

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}


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

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
}


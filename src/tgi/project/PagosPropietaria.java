package tgi.project;


/**
 * Write a description of class PagosPropietaria here.
 * 
 * @author Patricia Caruana 
 * @version 04/04/2017
 */
import java.time.LocalDate;
public class PagosPropietaria
{
    // instance variables - replace the example below with your own
    private int id_pago;
    private int id_propietaria;
    private int dinero;
    private int forma_pago;
    private LocalDate fecha_pago;
    private boolean pagado;

    /**
     * Constructor for objects of class PagosPropietaria
     */
    public PagosPropietaria(int id_pago, int id_propietaria, int dinero, int forma_pago,
    LocalDate fecha_pago, boolean pagado)
    {
        // initialise instance variables
        id_pago = id_pago;
        id_propietaria = id_propietaria;
        dinero = dinero;
        forma_pago = forma_pago;
        fecha_pago = fecha_pago; 
        pagado = pagado;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}


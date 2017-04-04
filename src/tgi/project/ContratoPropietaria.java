package tgi.project;

/**
 * Contrato entre la propietaria del articulo y la tienda
 * 
 * @author Patricia Caruana 
 * @version 04/04/2017
 */
import java.time.LocalDate; 
public class ContratoPropietaria
{
    // instance variables - replace the example below with your own
    private int ncontrato_propietaria;
    private int id_propietaria;
    private LocalDate fecha_de_contrato;
    private LocalDate fecha_fin_de_contrato;
    private String nrenovaciones_contrato;

    /**
     * Constructor for objects of class Contrato
     */
    public ContratoPropietaria(int ncontrato_propietaria, int id_propietaria, LocalDate fecha_de_contrato,
    LocalDate fecha_fin_de_contrato, String nrenovaciones_contrato)
    {
        // initialise instance variables
        ncontrato_propietaria = ncontrato_propietaria;
        id_propietaria = id_propietaria;
        fecha_de_contrato=fecha_de_contrato;
        fecha_fin_de_contrato=fecha_fin_de_contrato;
        nrenovaciones_contrato=nrenovaciones_contrato;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}

package tgi.project;


/**
 * Clase dependienta representa las trabajadoras de la tienda
 * 
 * @author Patricia Caruana
 * @version 03/04/2017
 */
public class Dependienta
{
    // instance variables - replace the example below with your own
    private int id_dependienta;
    private String DNI_dependienta;
    private String nombre_dependienta;
    private String apellidos_dependienta;

    /**
     * Constructor for objects of class Dependienta
     */
    public Dependienta(int id_dependienta, String DNI_dependienta, String nombre_dependienta, String apellidos_dependienta)
    {
        // initialise instance variables
        id_dependienta = id_dependienta;
        DNI_dependienta = DNI_dependienta;
        nombre_dependienta = nombre_dependienta;
        apellidos_dependienta = apellidos_dependienta;
    }

}


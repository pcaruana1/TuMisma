package tgi.project;


/**
 * ClientaAlquiler es cada clienta que alquila
 * 
 * @author Patricia Caruana 
 * @version 03/04/2017
 */
import java.time.LocalDate;

public class ClientaAlquiler
{
    // instance variables - replace the example below with your own
    private int id_clienta_alquiler;
    private String DNI_clienta_alquiler;
    private String nombre_clienta_alquiler;
    private String apellidos_clienta_alquiler;
    private String domicilio_clienta_alquiler;
    private int telefono_clienta_alquiler;
    private String email_clienta_alquiler;
    private LocalDate fecha_de_alta_clienta_alquiler;
    private int descuento_clienta_alquiler;
    private LocalDate fecha_de_nacimiento_clienta_alquiler;

    /**
     * Constructor for objects of class ClientaAlquiler
     */
    ClientaAlquiler(String apellidos_clienta_alquiler, String domicilio_clienta_alquiler, int telefono_clienta_alquiler,
    String email_clienta_alquiler, LocalDate fecha_de_alta_clienta_alquiler, int descuento_clienta_alquiler,
    LocalDate fecha_de_nacimiento_clienta_alquiler)
    {
        // initialise instance variables
      id_clienta_alquiler = id_clienta_alquiler;
      DNI_clienta_alquiler= DNI_clienta_alquiler;
      nombre_clienta_alquiler= nombre_clienta_alquiler;
      apellidos_clienta_alquiler= apellidos_clienta_alquiler;
      domicilio_clienta_alquiler= domicilio_clienta_alquiler;
      telefono_clienta_alquiler= telefono_clienta_alquiler;
      email_clienta_alquiler= email_clienta_alquiler;
      fecha_de_alta_clienta_alquiler= fecha_de_alta_clienta_alquiler;
      descuento_clienta_alquiler= descuento_clienta_alquiler;
      fecha_de_nacimiento_clienta_alquiler= fecha_de_nacimiento_clienta_alquiler;
    }

   
}


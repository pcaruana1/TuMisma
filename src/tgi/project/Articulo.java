package tgi.project;
/**
 * Esta clase representa los art�culos del inventario de la tienda
 * 
 * @author Patricia Caruana 
 * @version 03/09/2017
 */

public class Articulo
{
    // instance variables - replace the example below with your own
    private String nref_articulo;
    private String dise�ador;
    private String tipo_articulo;
    private boolean disponibilidad;
    private int talla;
    private String color;
    private int fianza;
    private int precioAlquiler;
    private int precioVenta;
    private String imagen;
    private String comentarios;

    /**
     * Constructor for objects of class Art�culo
     */
    public Articulo(String nref_articulo, String dise�ador, String tipo_articulo, 
    boolean disponibilidad, int talla, String color, int fianza, int precioAlquiler,
    int precioVenta, String imagen, String comentarios)
    {
      nref_articulo = nref_articulo;
      dise�ador = dise�ador;
      tipo_articulo = tipo_articulo;
      disponibilidad = disponibilidad;
      talla = talla;
      color = color;
      fianza = fianza;
      precioAlquiler = precioAlquiler;
      precioVenta = precioVenta;
      imagen = imagen;
      comentarios = comentarios;
    }
     public Articulo(String nref_articulo)
   {
        nref_articulo = nref_articulo;
        dise�ador = null;
        tipo_articulo = null;
        disponibilidad = false;
        talla = 0 ;
        color = null;
        fianza = 0;
        precioAlquiler = 0;
        precioVenta = 0;
        imagen = null;
        comentarios = null;
        
   }
}
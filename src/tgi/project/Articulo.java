package tgi.project;
/**
 * Esta clase representa los artículos del inventario de la tienda
 * 
 * @author Patricia Caruana 
 * @version 03/09/2017
 */

public class Articulo
{
    // instance variables - replace the example below with your own
    private String nref_articulo;
    private String diseñador;
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
     * Constructor for objects of class Artículo
     */
    public Articulo(String nref_articulo, String diseñador, String tipo_articulo, 
    boolean disponibilidad, int talla, String color, int fianza, int precioAlquiler,
    int precioVenta, String imagen, String comentarios)
    {
      nref_articulo = nref_articulo;
      diseñador = diseñador;
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
        diseñador = null;
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
	public String getNref_articulo() {
		return nref_articulo;
	}
	public void setNref_articulo(String nref_articulo) {
		this.nref_articulo = nref_articulo;
	}
	public String getDiseñador() {
		return diseñador;
	}
	public void setDiseñador(String diseñador) {
		this.diseñador = diseñador;
	}
	public String getTipo_articulo() {
		return tipo_articulo;
	}
	public void setTipo_articulo(String tipo_articulo) {
		this.tipo_articulo = tipo_articulo;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getFianza() {
		return fianza;
	}
	public void setFianza(int fianza) {
		this.fianza = fianza;
	}
	public int getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(int precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
     
}
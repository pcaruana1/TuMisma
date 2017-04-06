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
    private ContratoPropietaria contrato;
    private ComprasProveedor compra_proveedor;

    /**
     * Constructor general de Artículo
     */
    
    public Articulo(String nref_articulo, String diseñador, String tipo_articulo, 
    boolean disponibilidad, int talla, String color, int fianza, int precioAlquiler,
    int precioVenta, String imagen, String comentarios)
    {
      this.nref_articulo = nref_articulo;
      this.diseñador = diseñador;
      this.tipo_articulo = tipo_articulo;
      this.disponibilidad = disponibilidad;
      this.talla = talla;
      this.color = color;
      this.fianza = fianza;
      this.precioAlquiler = precioAlquiler;
      this.precioVenta = precioVenta;
      this.imagen = imagen;
      this.comentarios = comentarios;
    }
    
    
    //Constructor de articulo con propietaria
     public Articulo(String nref_articulo, String diseñador,
			String tipo_articulo, boolean disponibilidad, int talla,
			String color, int fianza, int precioAlquiler, int precioVenta,
			String imagen, String comentarios, ContratoPropietaria contrato) {
		this.nref_articulo = nref_articulo;
		this.diseñador = diseñador;
		this.tipo_articulo = tipo_articulo;
		this.disponibilidad = disponibilidad;
		this.talla = talla;
		this.color = color;
		this.fianza = fianza;
		this.precioAlquiler = precioAlquiler;
		this.precioVenta = precioVenta;
		this.imagen = imagen;
		this.comentarios = comentarios;
		this.contrato = contrato;
	}
     
     

     //Constructor de articulo comprado
	public Articulo(String nref_articulo, String diseñador,
			String tipo_articulo, boolean disponibilidad, int talla,
			String color, int fianza, int precioAlquiler, int precioVenta,
			String imagen, String comentarios, ComprasProveedor compra_proveedor) {
		this.nref_articulo = nref_articulo;
		this.diseñador = diseñador;
		this.tipo_articulo = tipo_articulo;
		this.disponibilidad = disponibilidad;
		this.talla = talla;
		this.color = color;
		this.fianza = fianza;
		this.precioAlquiler = precioAlquiler;
		this.precioVenta = precioVenta;
		this.imagen = imagen;
		this.comentarios = comentarios;
		this.compra_proveedor = compra_proveedor;
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
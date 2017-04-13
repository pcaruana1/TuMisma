package tgi.project;

import java.util.ArrayList;

/**
 * Esta clase representa los articulos del inventario de la tienda
 * 
 * @author Patricia Caruana 
 * @version 03/09/2017
 */

public class Articulo
{
    private String nref_articulo;
    private String designer;
    private String tipo_articulo;
    private boolean disponibilidad;
    private int talla;
    private String color;
    private int fianza;
    private int precioAlquiler;
    private int precioVenta;
    private String imagen;
    private String comentarios;
    private ContratoPropietariaArticulo contrato;
    private ComprasProveedor compra_proveedor;
    private ArrayList<Alquilar> lista_alquileres;

    /**
     * Constructor general de Articulo
     */
    
    public Articulo(String nref_articulo, String designer, String tipo_articulo, 
    boolean disponibilidad, int talla, String color, int fianza, int precioAlquiler,
    int precioVenta, String imagen, String comentarios)
    {
      this.nref_articulo = nref_articulo;
      this.designer = designer;
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
    
    
      

     //Constructor de articulo comprado
	public Articulo(String nref_articulo, String designer,
			String tipo_articulo, boolean disponibilidad, int talla,
			String color, int fianza, int precioAlquiler, int precioVenta,
			String imagen, String comentarios, ComprasProveedor compra_proveedor) {
		this.nref_articulo = nref_articulo;
		this.designer = designer;
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




	public String getDesigner() {
		return designer;
	}




	public void setDesigner(String designer) {
		this.designer = designer;
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




	public ContratoPropietariaArticulo getContrato() {
		return contrato;
	}




	public void setContrato(ContratoPropietariaArticulo contrato) {
		this.contrato = contrato;
	}




	public ComprasProveedor getCompra_proveedor() {
		return compra_proveedor;
	}




	public void setCompra_proveedor(ComprasProveedor compra_proveedor) {
		this.compra_proveedor = compra_proveedor;
	}




	public ArrayList<Alquilar> getLista_alquileres() {
		return lista_alquileres;
	}




	public void setLista_alquileres(ArrayList<Alquilar> lista_alquileres) {
		this.lista_alquileres = lista_alquileres;
	}

}
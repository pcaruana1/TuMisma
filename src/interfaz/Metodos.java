package interfaz;

import javax.swing.JOptionPane;

import tgi.project.Articulo;
import tgi.project.ContratoPropietaria;
import tgi.project.ContratoPropietariaArticulo;
import tgi.project.Propietaria;

public class Metodos {

	
	public ContratoPropietaria crearContratoPropietaria(Propietaria propietaria)
	{
		ContratoPropietaria c = new ContratoPropietaria(0, propietaria);
		return c;
	}
	
	public void añadirContratoPropietaria(ContratoPropietaria c, Propietaria propietaria)
	{
		propietaria.getLista_contratos().add(c);
	}
	

	public ContratoPropietariaArticulo crearContratoArticulo(int precio_tasacion)
	{
		ContratoPropietariaArticulo c = new ContratoPropietariaArticulo(precio_tasacion);
		return c;		
	}
	
	public void addArticulosContrato(ContratoPropietaria c, ContratoPropietariaArticulo articulo)
	{
		c.getLista_articulos().add(articulo);
	}
	
	
}

package interfaz;

import javax.swing.JOptionPane;

import tgi.project.Articulo;
import tgi.project.ContratoPropietaria;
import tgi.project.ContratoPropietariaArticulo;
import tgi.project.Propietaria;

public class Metodos {

	//Crea un contrato con los datos de la propietaria
	public static ContratoPropietaria crearContratoPropietaria(Propietaria propietaria)
	{
		ContratoPropietaria c = new ContratoPropietaria(0, propietaria);
		return c;
	}
	
	//Añade el contrato a la lista de contratos de la propietaria
	public static void updatePropietaria(ContratoPropietaria c, Propietaria propietaria)
	{
		propietaria.getLista_contratos().add(c);
	}
	
	//Crea un contrato con los datos del articulo
	public static ContratoPropietariaArticulo crearContratoArticulo(Articulo articulo, int precio_tasacion)
	{
		ContratoPropietariaArticulo c = new ContratoPropietariaArticulo(articulo, precio_tasacion);
		return c;		
	}
	
	//Añade el contrato con datos del articulo a la lista del contrato
	public static void updateContrato(ContratoPropietaria c, ContratoPropietariaArticulo c_articulo)
	{
		c.getLista_articulos().add(c_articulo);
	}
	
	
}

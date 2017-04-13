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
	
	//Buscar propietaria por email
	public static void mostrarPropietaria(Propietaria propietaria)
	{
		InputPropietaria m = new InputPropietaria();
		m.nombre.setText(propietaria.getNombre_propietaria());
		m.apellidos.setText(propietaria.getApellidos_propietaria());
		m.dni.setText(propietaria.getDNI_propietaria());
		m.direccion.setText(propietaria.getDomicilio_propietaria());
		m.email.setText(propietaria.getEmail_propietaria());
		m.ncuenta.setText(propietaria.getNcuenta_propietaria());
		
		}
	
	//Mostrar propietaria
	
}

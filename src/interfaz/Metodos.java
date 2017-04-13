package interfaz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import database.Database;
import tgi.project.Alquilar;
import tgi.project.Articulo;
import tgi.project.ComprasProveedor;
import tgi.project.ContratoPropietaria;
import tgi.project.ContratoPropietariaArticulo;
import tgi.project.Propietaria;

public class Metodos {

	//Crea un contrato con los datos de la propietaria
	public static ContratoPropietaria crearContratoPropietaria(Propietaria propietaria)
	{
		ContratoPropietaria c = new ContratoPropietaria(0, propietaria, 0);
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
	
	public static void mostrarTodasPropietarias()
	{
		List<Propietaria> lista_propietarias =Database.mostrarPropietarias();
		
		Iterator<Propietaria> rs = lista_propietarias.iterator();
	
		
		StringBuilder str = new StringBuilder();	
		
		
					while(rs.hasNext()){

					    //Retrieve by column name
						Propietaria propietaria = rs.next();
					    str.append("ID: " + propietaria.getId_propietaria());
					    str.append(", dni: " + propietaria.getDNI_propietaria());
					    str.append(", nombre: " + propietaria.getNombre_propietaria());
					    str.append(", apellido: " + propietaria.getApellidos_propietaria());
					    str.append(", domicilio: " + propietaria.getDomicilio_propietaria());
					    str.append(", telefono: " + propietaria.getTelefono_propietaria());
					    str.append(", email: " + propietaria.getEmail_propietaria());
					    str.append(", ncuenta: " + propietaria.getNcuenta_propietaria());
				
					    //new line
					    str.append("\n");
					}
			JOptionPane.showMessageDialog(null,str.toString());


	}
	
	//Mostrar articulos	
		public static void mostrarTodosArticulos()
		{
			List<Articulo> lista_articulos =Database.mostrarArticulos();
			
			Iterator<Articulo> rs = lista_articulos.iterator();
		
			
			StringBuilder str = new StringBuilder();	

						while(rs.hasNext()){

						    //Retrieve by column name
							Articulo articulo = rs.next();
						    str.append("nº referencia: " + articulo.getNref_articulo());
						    str.append(", diseñador: " + articulo.getDesigner());
						    str.append(", tipo: " + articulo.getTipo_articulo());
						    str.append(", disponibilidad: " + articulo.isDisponibilidad());
						    str.append(", talla: " + articulo.getTalla());
						    str.append(", color: " + articulo.getColor());
						    str.append(", fianza: " + articulo.getFianza());
						    str.append(", precioAlquiler: " + articulo.getPrecioAlquiler());
						    str.append(", precioVenta: " + articulo.getPrecioVenta());
						    str.append(", comentarios: " + articulo.getComentarios());
						    				    
					
						    //new line
						    str.append("\n");
						    str.append("\n");
						}
				JOptionPane.showMessageDialog(null,str.toString());
		}
		
	//Mostrar contratos propietarias
		public static void mostrarTodosContratosPropietarias()
		{
			List<ContratoPropietaria> lista_contratos = Database.mostrarContratosPropietarias();
			
			Iterator<ContratoPropietaria> rs = lista_contratos.iterator();
		
			
			StringBuilder str = new StringBuilder();	

						while(rs.hasNext()){

				
						    //Retrieve by column name
							ContratoPropietaria contrato = rs.next();
						    str.append("nº contrato: " + contrato.getNcontrato_propietaria());
						    str.append(", nº renovaciones: " + contrato.getNrenovaciones_contrato());
						    str.append(", id propietaria: " + contrato.getPropietaria().getId_propietaria());
						 
						    						    				    
					
						    //new line
						    str.append("\n");
						    str.append("\n");
						}
				JOptionPane.showMessageDialog(null,str.toString());
		}
	//Buscar propietarias		
		public static void buscarPropietariasDNI(){	
			/**SI NO ENCUENTRA MUESTRA UN MENSAJE DE QUE NO ENCUENTRA*/
			
			JFrame frame = new JFrame("InputDialog Example #2");
		    String dni = JOptionPane.showInputDialog(
		        frame, 
		        "Introduzca el dni de la propietaria: ", 
		        "BUSCAR PROPIETARIA", 
		        JOptionPane.WARNING_MESSAGE);	
		    
		    List<Propietaria> lista_propietarias =Database.buscarPropietaria(dni);
			
		    if(lista_propietarias.isEmpty()) 
		    {
		    	//NO ENCUENTRA
		    }
		    
		    else{
		    
			Iterator<Propietaria> rs = lista_propietarias.iterator();
			
			Propietaria propietaria = new Propietaria();
			
			StringBuilder str = new StringBuilder();	
			
			
						while(rs.hasNext()){

						    //Retrieve by column name
							propietaria = rs.next();
						    str.append("ID: " + propietaria.getId_propietaria());
						    str.append(", dni: " + propietaria.getDNI_propietaria());
						    str.append(", nombre: " + propietaria.getNombre_propietaria());
						    str.append(", apellido: " + propietaria.getApellidos_propietaria());
						    str.append(", domicilio: " + propietaria.getDomicilio_propietaria());
						    str.append(", telefono: " + propietaria.getTelefono_propietaria());
						    str.append(", email: " + propietaria.getEmail_propietaria());
						    str.append(", ncuenta: " + propietaria.getNcuenta_propietaria());
					
						    //new line
						    str.append("\n");
						}
				
				String[] buttons = { "Modificar", "Borrar", "Cancelar" };

			    int respuesta = JOptionPane.showOptionDialog(null, str.toString(), "Datos propietaria",
			        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

			    if(respuesta == 0 )
			    {
			    	//modificar
			    	InputPropietaria m = new InputPropietaria();
					m.nombre.setText(propietaria.getNombre_propietaria());
					m.apellidos.setText(propietaria.getApellidos_propietaria());
					m.telefono.setText(Integer.toString(propietaria.getTelefono_propietaria()));
					m.cp.setText(Integer.toString(propietaria.getCodigopostal_propietaria()));
					m.dni.setText(propietaria.getDNI_propietaria());
					m.direccion.setText(propietaria.getDomicilio_propietaria());
					m.email.setText(propietaria.getEmail_propietaria());
					m.ncuenta.setText(propietaria.getNcuenta_propietaria());
					
					m.setVisible(true);
			    }
			     
			    if(respuesta == 1)
			    {
			    	Database.borrarPropietaria(propietaria);
			    }
		    }
		}
}

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
	
	//Nueva propietaria
	public static void nuevaPropietaria()
	{
		InputPropietaria dialog = new InputPropietaria();
		dialog.modificar=true;
		dialog.setVisible(true);
		Propietaria propietaria = new Propietaria( dialog.dni.toString(), dialog.nombre.toString(),
			dialog.apellidos.toString(), dialog.direccion.toString(), Integer.parseInt(dialog.cp.getText().trim()),
			Integer.parseInt(dialog.telefono.getText().trim()), dialog.email.toString(), null,/*date,*/ dialog.ncuenta.toString());

		//INSERTAR PROPIETARIA A LA BD
		dialog.setVisible(false);
		dialog = null;
		
		preguntarContrato(propietaria);
	}
	
	public static void preguntarContrato(Propietaria propietaria)
	{
		String[] buttons = {"Si", "No"};

	    int respuesta = JOptionPane.showOptionDialog(null,  "�Desea crear un contrato para la propietaria?", 
	    		"Datos propietaria",
	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

	   	
			if(respuesta==0){
				
				//Crea el contrato y lo a�ade a la lista de contratos de la propietaria			
				Metodos.updatePropietaria(Metodos.crearContratoPropietaria(propietaria), propietaria);				
				InputArticulo.main(null);
			}
			
			/*else{
				//A�ADIR PROPIETARIA A LA BD
			}*/
			
		
	}
	
	//Crea un contrato con los datos de la propietaria
	public static ContratoPropietaria crearContratoPropietaria(Propietaria propietaria)
	{
		ContratoPropietaria c = new ContratoPropietaria(0, propietaria, 0);
		return c;
	}
	
	//A�ade el contrato a la lista de contratos de la propietaria
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
	
	//A�ade el contrato con datos del articulo a la lista del contrato
	public static void updateContrato(ContratoPropietaria c, ContratoPropietariaArticulo c_articulo)
	{
		c.getLista_articulos().add(c_articulo);
	}
	
	//Mostrar datos propietaria
	public static void mostrarPropietaria(Propietaria propietaria)
	{
		InputPropietaria m = new InputPropietaria();
		m.nombre.setText(propietaria.getNombre_propietaria());
		m.apellidos.setText(propietaria.getApellidos_propietaria());
		m.dni.setText(propietaria.getDNI_propietaria());
        m.telefono.setText(Integer.toString(propietaria.getTelefono_propietaria()));
		m.direccion.setText(propietaria.getDomicilio_propietaria());
        m.cp.setText(Integer.toString(propietaria.getCodigopostal_propietaria()));
		m.email.setText(propietaria.getEmail_propietaria());
		m.ncuenta.setText(propietaria.getNcuenta_propietaria());
		m.modificar=true;
		
		m.setVisible(true);		
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
						    str.append("n� referencia: " + articulo.getNref_articulo());
						    str.append(", dise�ador: " + articulo.getDesigner());
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
						    str.append("n� contrato: " + contrato.getNcontrato_propietaria());
						    str.append(", n� renovaciones: " + contrato.getNrenovaciones_contrato());
						    str.append(", id propietaria: " + contrato.getPropietaria().getId_propietaria());		 
						    						    				    
					
						    //new line
						    str.append("\n\n");
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
		    	//No encuentra esa propietaria
		    	 JOptionPane.showMessageDialog(frame,"No hay ninguna propietaria con DNI " + dni+ "'.");
		    }
		    
		    else{
		    List<ContratoPropietaria> lista_contratos = new ArrayList<>();
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
						    lista_contratos=Database.buscarContrato(propietaria);
						    
						    if(lista_contratos.isEmpty()){
						    	str.append("\nNo tiene contratos");
						    }
						    
						    Iterator<ContratoPropietaria> i = lista_contratos.iterator();
						    ContratoPropietaria contrato = new ContratoPropietaria();
						    
						    while(i.hasNext())
						    {
						    	contrato = i.next();
						    	str.append("\nn� contrato : " + contrato.getNcontrato_propietaria());
						    	str.append("\nn� renovaciones : " +contrato.getNrenovaciones_contrato());
						    }
					
						    //new line
						    str.append("\n\n");
						}
				
				String[] buttons = { "Modificar", "Borrar", "Cancelar" };

			    int respuesta = JOptionPane.showOptionDialog(null, str.toString(), "Datos propietaria",
			        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

			    if(respuesta == 0 )
			    {
			    	//modificar
			    	mostrarPropietaria(propietaria);
					
			    }
			     
			    if(respuesta == 1)
			    {
			    	Database.borrarPropietaria(propietaria);
			    }
		    }
		}
}

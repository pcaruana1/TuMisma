package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
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
		
		//Creo el formulario de entrada de datos
		final InputPropietaria dialog = new InputPropietaria();
		dialog.setVisible(true);
		
		//Creo boton para añadir propietaria
		JButton okButton = new JButton("OK");
		dialog.buttonPane.add(okButton);
		

		
		//Añado un evento al boton
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.crearPropietaria();
				System.out.println(dialog.propietaria.getNombre_propietaria());
				if(preguntarContrato()) {
					
					//Crea el contrato y lo añade a la lista de contratos de la propietaria
					ContratoPropietaria c = crearContratoPropietaria(dialog.propietaria);
					System.out.println(c.getNcontrato_propietaria());
					updatePropietaria(c, dialog.propietaria);
					
					//Solicita datos del articulo
					Articulo a = nuevoArticulo();
					ContratoPropietariaArticulo ca = precioTasacion(a);
					updateContrato(c, ca);
				}
				else{
					//AÑADO PROPIETARIA
				}
			}
		});
		okButton.setActionCommand("OK");
			
		//dialog.setVisible(false);
		//dialog = null;
		
	}
	
	public static boolean preguntarContrato()
	{
		String[] buttons = {"Si", "No"};

	    int respuesta = JOptionPane.showOptionDialog(null,  "¿Desea crear un contrato para la propietaria?", 
	    		"Datos propietaria",
	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);

	   	
			if(respuesta==0){
				
				return true;
				
			}
			else{
				return false;
		}
	}

	
	
	public static Articulo nuevoArticulo()
	{
		//Input articulo
		try {
			final InputArticulo dialog = new InputArticulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			JButton okButton = new JButton("OK");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Crea un articulo un contrato articulo
					dialog.articulo = dialog.crearArticulo();

			}
			});
			okButton.setActionCommand("OK");
			dialog.buttonPane.add(okButton);
			
			return dialog.articulo;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
				
	}
		
	public static ContratoPropietariaArticulo precioTasacion(Articulo articulo){

	    String precio = JOptionPane.showInputDialog(null, "Introduzca el precio de tasacion:");
	    return Metodos.crearContratoArticulo(articulo, Integer.parseInt(precio));
		}
	
	
	public static void masArticulos(){
		Object[] options = {"Si", "No"};
		int n = JOptionPane.showOptionDialog(null,
		    "¿Desea añadir más articulos al contrato?",
		    "",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,     //do not use a custom Icon
		    options,  //the titles of buttons
		    options[0]); //default button title
		
		
		if(n==0){
			
			nuevoArticulo();
			
		}
		else{
			
		}
	}
	
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
						    	str.append("\nnº contrato : " + contrato.getNcontrato_propietaria());
						    	str.append("\nnº renovaciones : " +contrato.getNrenovaciones_contrato());
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
			    	JOptionPane.showConfirmDialog(null, "Propietaria borrada", "BORRADO", JOptionPane.INFORMATION_MESSAGE);
			    }
		    }
		}
}

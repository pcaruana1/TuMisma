package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import tgi.project.Articulo;
import tgi.project.ContratoPropietaria;
import tgi.project.ContratoPropietariaArticulo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	JTextArea marca = new JTextArea();
	JTextArea tipo = new JTextArea();
	JTextArea talla = new JTextArea();
	JTextArea color = new JTextArea();
	JTextArea fianza = new JTextArea();
	JTextArea precioAlquiler = new JTextArea();
	JTextArea precioVenta = new JTextArea();
	JTextArea comentarios = new JTextArea();
	JTextArea imagen = new JTextArea();
	
	/**
	 * Create the dialog.
	 */
	public InputArticulo() {
		setTitle("Datos Articulo");
		setBounds(100, 100, 479, 376);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Marca :");
		lblNewLabel.setBounds(12, 13, 84, 16);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblTipo = new JLabel("Tipo :");
			lblTipo.setBounds(12, 39, 84, 16);
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblTalla = new JLabel("Talla :");
			lblTalla.setBounds(12, 68, 84, 16);
			contentPanel.add(lblTalla);
		}
		{
			JLabel lblColor = new JLabel("Color :");
			lblColor.setBounds(12, 98, 84, 16);
			contentPanel.add(lblColor);
		}
		{
			JLabel lblFianza = new JLabel("Fianza :");
			lblFianza.setBounds(12, 132, 84, 16);
			contentPanel.add(lblFianza);
		}
		{
			JLabel lblPrecioAlquiler = new JLabel("Precio Alquiler :");
			lblPrecioAlquiler.setBounds(12, 163, 98, 16);
			contentPanel.add(lblPrecioAlquiler);
		}
		{
			JLabel lblPrecioVenta = new JLabel("Precio Venta :");
			lblPrecioVenta.setBounds(12, 192, 98, 16);
			contentPanel.add(lblPrecioVenta);
		}
		{
			JLabel lblComentarios = new JLabel("Comentarios :");
			lblComentarios.setBounds(12, 221, 98, 16);
			contentPanel.add(lblComentarios);
		}
		{
			JLabel lblImagen = new JLabel("Imagen :");
			lblImagen.setBounds(12, 250, 98, 16);
			contentPanel.add(lblImagen);
		}
		
		
		marca.setBounds(69, 10, 125, 22);
		contentPanel.add(marca);
		
		
		tipo.setBounds(69, 36, 125, 22);
		contentPanel.add(tipo);
		
		
		talla.setBounds(69, 65, 125, 22);
		contentPanel.add(talla);
		
		
		color.setBounds(69, 95, 125, 22);
		contentPanel.add(color);
		
		
		fianza.setBounds(69, 127, 125, 22);
		contentPanel.add(fianza);
		
		
		precioAlquiler.setBounds(114, 160, 125, 22);
		contentPanel.add(precioAlquiler);
		
		
		precioVenta.setBounds(114, 189, 125, 22);
		contentPanel.add(precioVenta);
		
		
		comentarios.setBounds(114, 221, 125, 22);
		contentPanel.add(comentarios);
		
		
		imagen.setBounds(114, 247, 125, 22);
		contentPanel.add(imagen);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//Crea un articulo y un contrato articulo
						precioTasacion(crearArticulo());

				}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
	
	public Articulo crearArticulo()
	{
		Articulo articulo = new Articulo(null, this.marca.toString(), this.tipo.toString(),
				true, Integer.parseInt(this.talla.getText()), this.color.toString(),
				Integer.parseInt(this.fianza.getText()), Integer.parseInt(this.precioAlquiler.getText()),
				Integer.parseInt(this.precioVenta.getText()), this.imagen.toString(), this.comentarios.toString());
	
		return articulo;
	}
	
	public ContratoPropietariaArticulo precioTasacion(Articulo articulo){

	    String precio = JOptionPane.showInputDialog(null, "Introduzca el precio de tasacion:");
	    return Metodos.crearContratoArticulo(articulo, Integer.parseInt(precio));
		}

	
}

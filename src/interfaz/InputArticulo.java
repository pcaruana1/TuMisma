package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
	
	JTextField marca = new JTextField();
	JTextField tipo = new JTextField();
	JTextField talla = new JTextField();
	JTextField color = new JTextField();
	JTextField fianza = new JTextField();
	JTextField precioAlquiler = new JTextField();
	JTextField precioVenta = new JTextField();
	JTextField comentarios = new JTextField();
	JTextField imagen = new JTextField();
	JPanel buttonPane = new JPanel();
	Articulo articulo;
	
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
		lblNewLabel.setBounds(106, 13, 84, 16);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblTipo = new JLabel("Tipo :");
			lblTipo.setBounds(116, 40, 52, 16);
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblTalla = new JLabel("Talla :");
			lblTalla.setBounds(106, 69, 37, 16);
			contentPanel.add(lblTalla);
		}
		{
			JLabel lblColor = new JLabel("Color :");
			lblColor.setBounds(116, 98, 39, 16);
			contentPanel.add(lblColor);
		}
		{
			JLabel lblFianza = new JLabel("Fianza :");
			lblFianza.setBounds(106, 134, 84, 16);
			contentPanel.add(lblFianza);
		}
		{
			JLabel lblPrecioAlquiler = new JLabel("Precio Alquiler :");
			lblPrecioAlquiler.setBounds(60, 163, 98, 16);
			contentPanel.add(lblPrecioAlquiler);
		}
		{
			JLabel lblPrecioVenta = new JLabel("Precio Venta :");
			lblPrecioVenta.setBounds(70, 192, 98, 16);
			contentPanel.add(lblPrecioVenta);
		}
		{
			JLabel lblComentarios = new JLabel("Comentarios :");
			lblComentarios.setBounds(70, 221, 98, 16);
			contentPanel.add(lblComentarios);
		}
		{
			JLabel lblImagen = new JLabel("Imagen :");
			lblImagen.setBounds(97, 250, 52, 16);
			contentPanel.add(lblImagen);
		}
		
		
		marca.setBounds(172, 10, 125, 22);
		contentPanel.add(marca);
		
		
		tipo.setBounds(172, 36, 125, 22);
		contentPanel.add(tipo);
		
		
		talla.setBounds(172, 65, 125, 22);
		contentPanel.add(talla);
		
		
		color.setBounds(172, 95, 125, 22);
		contentPanel.add(color);
		
		
		fianza.setBounds(172, 129, 125, 22);
		contentPanel.add(fianza);
		
		
		precioAlquiler.setBounds(172, 160, 125, 22);
		contentPanel.add(precioAlquiler);
		
		
		precioVenta.setBounds(172, 189, 125, 22);
		contentPanel.add(precioVenta);
		
		
		comentarios.setBounds(172, 218, 125, 22);
		contentPanel.add(comentarios);
		
		
		imagen.setBounds(172, 247, 125, 22);
		contentPanel.add(imagen);
		{
			
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
	
	public void crearArticulo()
	{
		this.articulo = new Articulo(0, this.marca.getText(), this.tipo.getText(),
				true, Integer.parseInt(this.talla.getText()), this.color.getText(),
				Integer.parseInt(this.fianza.getText()), Integer.parseInt(this.precioAlquiler.getText()),
				Integer.parseInt(this.precioVenta.getText()), this.imagen.getText(), this.comentarios.getText());
	

	}


	
}

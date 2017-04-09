package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import tgi.project.Articulo;

public class InputArticulo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InputArticulo dialog = new InputArticulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
		
		JTextArea marca = new JTextArea();
		marca.setBounds(69, 10, 125, 22);
		contentPanel.add(marca);
		
		JTextArea tipo = new JTextArea();
		tipo.setBounds(69, 36, 125, 22);
		contentPanel.add(tipo);
		
		JTextArea talla = new JTextArea();
		talla.setBounds(69, 65, 125, 22);
		contentPanel.add(talla);
		
		JTextArea color = new JTextArea();
		color.setBounds(69, 95, 125, 22);
		contentPanel.add(color);
		
		JTextArea fianza = new JTextArea();
		fianza.setBounds(69, 127, 125, 22);
		contentPanel.add(fianza);
		
		JTextArea precioAlquiler = new JTextArea();
		precioAlquiler.setBounds(114, 160, 125, 22);
		contentPanel.add(precioAlquiler);
		
		JTextArea precioVenta = new JTextArea();
		precioVenta.setBounds(114, 189, 125, 22);
		contentPanel.add(precioVenta);
		
		JTextArea comentarios = new JTextArea();
		comentarios.setBounds(114, 221, 125, 22);
		contentPanel.add(comentarios);
		
		JTextArea imagen = new JTextArea();
		imagen.setBounds(114, 247, 125, 22);
		contentPanel.add(imagen);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
		
		Articulo articulo = new Articulo(null, marca.toString(), tipo.toString(),
				true, Integer.parseInt(talla.getText()), color.toString(),
				Integer.parseInt(fianza.getText()), Integer.parseInt(precioAlquiler.getText()),
				Integer.parseInt(precioVenta.getText()), imagen.toString(), comentarios.toString());
		
	}
}

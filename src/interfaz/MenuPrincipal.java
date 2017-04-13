package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevaPropietaria = new JButton("Nueva Propietaria");
		btnNuevaPropietaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputPropietaria.main(null);
			}
		});
		btnNuevaPropietaria.setBounds(35, 34, 139, 34);
		contentPane.add(btnNuevaPropietaria);
		
		JButton btnNewButton = new JButton("Ver Propietarias");
		btnNewButton.setBounds(214, 34, 139, 34);
		contentPane.add(btnNewButton);
		
		JButton btnBuscarPropietaria = new JButton("Buscar Propietaria");
		btnBuscarPropietaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscarPropietaria.setBounds(392, 34, 155, 34);
		contentPane.add(btnBuscarPropietaria);
		
		JButton btnVerArticulos = new JButton("Ver Articulos");
		btnVerArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerArticulos.setBounds(214, 99, 139, 34);
		contentPane.add(btnVerArticulos);
		
		JButton btnBuscarArticulo = new JButton("Buscar Articulo");
		btnBuscarArticulo.setBounds(392, 99, 166, 34);
		contentPane.add(btnBuscarArticulo);
		
		JButton btnNuevoArticulo = new JButton("Nuevo Articulo");
		btnNuevoArticulo.setBounds(35, 99, 139, 34);
		contentPane.add(btnNuevoArticulo);
		
		JButton btnNuevaProveedor = new JButton("Nueva Proveedor");
		btnNuevaProveedor.setBounds(35, 167, 139, 34);
		contentPane.add(btnNuevaProveedor);
		
		JButton btnVerProveedores = new JButton("Ver Proveedores");
		btnVerProveedores.setBounds(214, 167, 139, 34);
		contentPane.add(btnVerProveedores);
		
		JButton btnBuscarProveedores = new JButton("Buscar Proveedores");
		btnBuscarProveedores.setBounds(392, 167, 166, 34);
		contentPane.add(btnBuscarProveedores);
	}
}

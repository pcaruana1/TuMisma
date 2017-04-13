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

import database.Database;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
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
		btnNuevaPropietaria.setBounds(130, 82, 139, 34);
		contentPane.add(btnNuevaPropietaria);
		
		JButton btnNewButton = new JButton("Ver Propietarias");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Funcion ver propietarias
				Metodos.mostrarTodasPropietarias();
			}
		});
		btnNewButton.setBounds(35, 170, 139, 34);
		contentPane.add(btnNewButton);
		
		JButton btnBuscarPropietaria = new JButton("Buscar Propietaria");
		btnBuscarPropietaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Buscar propietarias
				Metodos.buscarPropietariasDNI();
			}
		});
		btnBuscarPropietaria.setBounds(342, 82, 155, 34);
		contentPane.add(btnBuscarPropietaria);
		
		JButton btnVerArticulos = new JButton("Ver Articulos");
		btnVerArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Funcion ver articulos
				Metodos.mostrarTodosArticulos();
			}
		});
		btnVerArticulos.setBounds(408, 170, 139, 34);
		contentPane.add(btnVerArticulos);
		
		JButton btnVerContratos = new JButton("Ver Contratos");
		btnVerContratos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Funcion ver contratos
				Metodos.mostrarTodosContratosPropietarias();
			}
		});
		btnVerContratos.setBounds(214, 170, 139, 34);
		contentPane.add(btnVerContratos);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//37812387R
		Metodos.buscarPropietariasDNI();
	}
}

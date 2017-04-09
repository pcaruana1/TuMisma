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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuevaPropietaria = new JButton("Nueva Propietaria");
		btnNuevaPropietaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevaPropietaria.setBounds(35, 34, 139, 34);
		contentPane.add(btnNuevaPropietaria);
		
		JButton btnNuevaClienta = new JButton("Nueva Clienta");
		btnNuevaClienta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InputClienta.main(null);
			}
		});
		btnNuevaClienta.setBounds(35, 112, 139, 34);
		contentPane.add(btnNuevaClienta);
		
		JButton btnNewButton = new JButton("Ver Propietarias");
		btnNewButton.setBounds(194, 34, 139, 34);
		contentPane.add(btnNewButton);
		
		JButton btnVerClientas = new JButton("Ver Clientas");
		btnVerClientas.setBounds(194, 112, 139, 34);
		contentPane.add(btnVerClientas);
	}
}

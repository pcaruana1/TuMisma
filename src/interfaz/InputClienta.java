package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import tgi.project.ClientaAlquiler;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputClienta extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InputClienta dialog = new InputClienta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InputClienta() {
		setTitle("Datos Clienta");
		setBounds(100, 100, 495, 408);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(12, 23, 54, 24);
		contentPanel.add(lblNombre);
		
		final JTextArea nombre = new JTextArea();
		nombre.setBounds(78, 24, 155, 22);
		contentPanel.add(nombre);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(12, 67, 79, 24);
		contentPanel.add(lblApellidos);
		
		final JTextArea apellidos = new JTextArea();
		apellidos.setBounds(78, 68, 255, 22);
		contentPanel.add(apellidos);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(12, 110, 79, 24);
		contentPanel.add(lblDni);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n: ");
		lblDireccin.setBounds(12, 148, 79, 24);
		contentPanel.add(lblDireccin);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal: ");
		lblCodigoPostal.setBounds(12, 185, 91, 24);
		contentPanel.add(lblCodigoPostal);
		
		JLabel lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setBounds(268, 23, 65, 24);
		contentPanel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(236, 110, 54, 24);
		contentPanel.add(lblEmail);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento: ");
		lblFechaDeNacimiento.setBounds(12, 259, 137, 24);
		contentPanel.add(lblFechaDeNacimiento);
		
		final JTextArea dni = new JTextArea();
		dni.setBounds(78, 111, 128, 22);
		contentPanel.add(dni);
		
		final JTextArea direccion = new JTextArea();
		direccion.setBounds(78, 149, 318, 22);
		contentPanel.add(direccion);
		
		final JTextArea cp = new JTextArea();
		cp.setBounds(108, 186, 98, 22);
		contentPanel.add(cp);
		
		final JTextArea telefono = new JTextArea();
		telefono.setBounds(330, 24, 113, 22);
		contentPanel.add(telefono);
		
		final JTextArea email = new JTextArea();
		email.setBounds(289, 111, 154, 22);
		contentPanel.add(email);
		
		final JDateChooser bday = new JDateChooser();
		bday.setBounds(152, 261, 105, 22);
		contentPanel.add(bday);
		
		final JLabel lblDescuento = new JLabel("Descuento (%):");
		lblDescuento.setBounds(12, 222, 113, 24);
		contentPanel.add(lblDescuento);
		
		final JTextArea descuento = new JTextArea();
		descuento.setText("0");
		descuento.setBounds(108, 224, 98, 22);
		contentPanel.add(descuento);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						java.time.LocalDate date = bday.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
						
						ClientaAlquiler clienta = new ClientaAlquiler(dni.toString(), nombre.toString(),
								apellidos.toString(), direccion.toString(), Integer.parseInt(cp.getText().trim()),
								Integer.parseInt(telefono.getText().trim()),
								email.toString(), LocalDate.now(), Integer.parseInt(descuento.getText().trim()), date);
						
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

}

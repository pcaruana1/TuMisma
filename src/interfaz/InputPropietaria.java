package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class InputPropietaria extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InputPropietaria dialog = new InputPropietaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InputPropietaria() {
		setTitle("Datos Propietaria");
		setBounds(100, 100, 495, 408);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(12, 23, 54, 24);
		contentPanel.add(lblNombre);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(78, 24, 155, 22);
		contentPanel.add(textArea);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(12, 67, 79, 24);
		contentPanel.add(lblApellidos);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(78, 68, 255, 22);
		contentPanel.add(textArea_1);
		
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
		
		JLabel lblNcuenta = new JLabel("N\u00BAcuenta: ");
		lblNcuenta.setBounds(12, 222, 84, 24);
		contentPanel.add(lblNcuenta);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(78, 111, 128, 22);
		contentPanel.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(78, 149, 318, 22);
		contentPanel.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(108, 186, 98, 22);
		contentPanel.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(330, 24, 113, 22);
		contentPanel.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(289, 111, 154, 22);
		contentPanel.add(textArea_6);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(108, 223, 261, 22);
		contentPanel.add(textArea_8);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(152, 261, 105, 22);
		contentPanel.add(dateChooser);
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
	}
}

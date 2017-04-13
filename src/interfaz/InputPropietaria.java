package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.time.ZoneId;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import tgi.project.ContratoPropietaria;
import tgi.project.Propietaria;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputPropietaria extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	JTextArea nombre = new JTextArea();
	JTextArea apellidos = new JTextArea();
	JTextArea dni = new JTextArea();
	JTextArea direccion = new JTextArea();
	JTextArea cp = new JTextArea();
	JTextArea telefono = new JTextArea();
	JTextArea email = new JTextArea();
	JTextArea ncuenta = new JTextArea();
	JTextArea bday = new JTextArea();
	
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
		
		
		this.nombre.setBounds(78, 24, 155, 22);
		contentPanel.add(nombre);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setBounds(12, 67, 79, 24);
		contentPanel.add(lblApellidos);
		
		
		apellidos.setBounds(78, 68, 255, 22);
		contentPanel.add(apellidos);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(12, 110, 79, 24);
		contentPanel.add(lblDni);
		
		JLabel lblDireccin = new JLabel("Direccion: ");
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
		
		
		dni.setBounds(78, 111, 128, 22);
		contentPanel.add(dni);
		
		
		direccion.setBounds(78, 149, 318, 22);
		contentPanel.add(direccion);
		
		
		cp.setBounds(108, 186, 98, 22);
		contentPanel.add(cp);
				
		telefono.setBounds(330, 24, 113, 22);
		contentPanel.add(telefono);
		
		email.setBounds(289, 111, 154, 22);
		contentPanel.add(email);
		
		ncuenta.setBounds(108, 223, 261, 22);
		contentPanel.add(ncuenta);
		
		bday.setBounds(152, 261, 105, 22);
		contentPanel.add(bday);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//java.time.LocalDate date = bday.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
						
						Propietaria propietaria = new Propietaria( dni.toString(), nombre.toString(), apellidos.toString(),
								direccion.toString(), Integer.parseInt(telefono.getText().trim()), email.toString(), null,/*date,*/ ncuenta.toString());
						preguntarContrato(propietaria);

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
	
	public void preguntarContrato(Propietaria propietaria)
	{
		
			Object[] options = {"Si",
	        "No"};
			int n = JOptionPane.showOptionDialog(this,
			    "�Desea crear un contrato para la propietaria?",
			    "",
			    JOptionPane.YES_NO_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,     //do not use a custom Icon
			    options,  //the titles of buttons
			    options[0]); //default button title
			
			if(n==0){
				
				//Crea el contrato y lo a�ade a la lista de contratos de la propietaria			
				Metodos.updatePropietaria(Metodos.crearContratoPropietaria(propietaria), propietaria);
				this.setVisible(false);
				InputArticulo.main(null);
			}
			
			/*else{
				//A�ADIR PROPIETARIA A LA BD
			}*/
			
		
	}
}

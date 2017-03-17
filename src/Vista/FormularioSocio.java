package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioSocio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDireccion;
	private JTextField textFieldPoblacion;
	private JTextField textFieldProvincia;
	private JTextField textFieldDNI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormularioSocio dialog = new FormularioSocio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormularioSocio() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel labelNombre = new JLabel("Nombre :");
			labelNombre.setBounds(29, 38, 57, 14);
			contentPanel.add(labelNombre);
		}
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(117, 35, 86, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido :");
		labelApellido.setBounds(29, 69, 46, 14);
		contentPanel.add(labelApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(117, 66, 86, 20);
		contentPanel.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel labelDireccion = new JLabel("Direcci\u00F3n :");
		labelDireccion.setBounds(29, 100, 57, 14);
		contentPanel.add(labelDireccion);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(117, 97, 86, 20);
		contentPanel.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel labelPoblacion = new JLabel("Poblaci\u00F3n :");
		labelPoblacion.setBounds(29, 138, 57, 14);
		contentPanel.add(labelPoblacion);
		
		JLabel labelProvincia = new JLabel("Provincia :");
		labelProvincia.setBounds(29, 175, 57, 14);
		contentPanel.add(labelProvincia);
		
		JLabel labelDNI = new JLabel("DNI :");
		labelDNI.setBounds(29, 208, 46, 14);
		contentPanel.add(labelDNI);
		
		textFieldPoblacion = new JTextField();
		textFieldPoblacion.setBounds(117, 135, 86, 20);
		contentPanel.add(textFieldPoblacion);
		textFieldPoblacion.setColumns(10);
		
		textFieldProvincia = new JTextField();
		textFieldProvincia.setBounds(117, 172, 86, 20);
		contentPanel.add(textFieldProvincia);
		textFieldProvincia.setColumns(10);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(117, 205, 86, 20);
		contentPanel.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		JButton buttonGuardar = new JButton("Guardar");
		buttonGuardar.setBounds(257, 227, 89, 23);
		contentPanel.add(buttonGuardar);
	}
}

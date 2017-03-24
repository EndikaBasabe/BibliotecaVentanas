package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controlador.SocioControlador;
import modelo.Socio;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JScrollPane;

public class BusquedaSocio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private SocioControlador socioControlador;
	private JTable table;
	private JScrollPane scrollPane;
	
	/**
	 * Create the dialog.
	 */
	public BusquedaSocio(JDialog parent, boolean modal) {
		
		super(parent,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 67, 348, 165);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

	public SocioControlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(SocioControlador socioControlador) {
		this.socioControlador = socioControlador;
	}

	public void rellenarTabla(ArrayList<Socio> socios) {
		
		DefaultTableModel dtm = new DefaultTableModel();

		dtm.setColumnIdentifiers(new Object[] { "NOMBRE", "APELLIDO", "DIRECCION", "POBLACION", "PROVINCIA", "DNI"});

		for (Socio socio : socios) {
			dtm.addRow(new Object[] { socio.getNombre(), socio.getApellido(), socio.getDireccion(), socio.getPoblacion(), socio.getProvincia(), socio.getDni()});
		}
		
		table.setModel(dtm);
		
	TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(dtm);
		
		table.setRowSorter(modeloOrdenado);
		
	}
}

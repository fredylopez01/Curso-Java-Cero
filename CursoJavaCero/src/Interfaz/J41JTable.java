package Interfaz;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class J41JTable extends JFrame {
	private DefaultTableModel modelo;
	private JTable table;
	
	public J41JTable() {
		setLayout(null);
		setSize(500, 300);
		setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Nacionalidad");
		modelo.addColumn("Edad");
		
		
		for(int i = 0; i < 10; i++) {
			String[] persona1 = {"Alejandro", "21", "Peruana"};
			String[] persona2 = {"Fredy", "19", "Colombiana"};
			modelo.addRow(persona1);
			modelo.addRow(persona2);
		}
		
		table = new JTable(modelo);
		add(table);
		
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(20, 20, 300, 200);
		add(barra);
	}

	public static void main(String[] args) {
		J41JTable window = new J41JTable();

	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

}

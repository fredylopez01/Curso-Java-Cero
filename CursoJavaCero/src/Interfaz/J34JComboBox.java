package Interfaz;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class J34JComboBox extends JFrame implements ItemListener {
	private JComboBox<String> options;
	
	public J34JComboBox() {
		setLayout(null);
		options = new JComboBox<String>();
		options.setBounds(20, 20, 100, 20);
		add(options);
		
		options.addItem("Rojo");
		options.addItem("Azul");
		options.addItem("Amarillo");
		options.addItem("Verde");
		options.addItem("Negro");
		options.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == options) {
			setTitle(options.getSelectedItem().toString());
		}
	}
	

	public static void main(String[] args) {
		J34JComboBox window = new J34JComboBox();
		window.setSize(400, 200);
		window.setTitle("JComboBox");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

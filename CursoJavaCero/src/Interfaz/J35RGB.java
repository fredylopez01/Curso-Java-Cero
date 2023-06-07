package Interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J35RGB extends JFrame implements ActionListener {
	private JComboBox<String> optionsOne;
	private JLabel red;
	private JComboBox<String> optionsTwo;
	private JLabel green;
	private JComboBox<String> optionsThree;
	private JLabel blue;
	private JButton apply;
	
	public J35RGB() {
		setLayout(null);
		optionsOne = new JComboBox<String>();
		optionsOne.setBounds(120, 20, 80, 20);
		for(int i = 0; i <= 255; i++) {
			optionsOne.addItem(String.valueOf(i));
		}
		add(optionsOne);
		
		red = new JLabel("Rojo");
		red.setBounds(20, 20, 80, 20);
		add(red);
		
		optionsTwo = new JComboBox<String>();
		optionsTwo.setBounds(120, 60, 80, 20);
		for(int i = 0; i <= 255; i++) {
			optionsTwo.addItem(String.valueOf(i));
		}
		add(optionsTwo);
		
		green = new JLabel("Verde");
		green.setBounds(20, 60, 80, 20);
		add(green);
		
		optionsThree = new JComboBox<String>();
		optionsThree.setBounds(120, 100, 80, 20);
		add(optionsThree);
		
		blue = new JLabel("Azul");
		blue.setBounds(20, 100, 80, 20);
		for(int i = 0; i <= 255; i++) {
			optionsThree.addItem(String.valueOf(i));
		}
		add(blue);
		
		apply = new JButton("Aplicar");
		apply.setBounds(20, 140, 100, 40);
		apply.addActionListener(this);
		add(apply);
	}
	public static void main(String[] args) {
		J35RGB window = new J35RGB();
		window.setSize(250, 230);
		window.setTitle("Colores");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == apply) {
			int cadOne = Integer.parseInt(optionsOne.getSelectedItem().toString());
			int cadTwo = Integer.parseInt(optionsTwo.getSelectedItem().toString());
			int cadThree = Integer.parseInt(optionsThree.getSelectedItem().toString());
			
			Color color = new Color(cadOne, cadTwo, cadThree);
			apply.setBackground(color);
		}
		
	}

}

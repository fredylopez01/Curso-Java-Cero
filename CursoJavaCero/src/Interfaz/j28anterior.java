package Interfaz;

import javax.swing.*;
import java.awt.event.*;

public class j28anterior extends JFrame implements ActionListener{
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JLabel labelOne;
	
	public j28anterior() {
		setLayout(null);
		buttonOne = new JButton("1");
		buttonOne.setBounds(10, 100, 90, 30);
		add(buttonOne);
		buttonOne.addActionListener(this);
		
		buttonTwo = new JButton("2");
		buttonTwo.setBounds(110, 100, 90, 30);
		add(buttonTwo);
		buttonTwo.addActionListener(this);
		
		buttonThree = new JButton("3");
		buttonThree.setBounds(210, 100, 90, 30);
		add(buttonThree);
		buttonThree.addActionListener(this);
		
		labelOne = new JLabel("Hola. En espera...");
		labelOne.setBounds(10, 20, 150, 20);
		add(labelOne);
		
	}
	
	public static void main (String [] args) {
		j28anterior interfaz = new j28anterior();
		interfaz.setBounds(0,0, 350, 200);
		interfaz.setVisible(true);
		interfaz.setResizable(true);
		interfaz.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonOne) {
			labelOne.setText("Has presionado el boton 1");
		} else if(e.getSource() == buttonTwo) {
			labelOne.setText("Has presionado el boton 2");
		} else if(e.getSource() == buttonThree) {
			labelOne.setText("Has presionado el boton 3");
		}
	}

    
}
package Interfaz;

import javax.swing.*;
import java.awt.event.*;

public class J29JTextField extends JFrame implements ActionListener {
	private JTextField answer;
	private JLabel labelQuestion; 
	private JButton buttonOne;
	private JButton buttonTwo;
	
	public J29JTextField() {
		setLayout(null);
		answer = new JTextField();
		answer.setBounds(120, 10, 150, 20);
		add(answer);
		
		labelQuestion = new JLabel("Nombre: ");
		labelQuestion.setBounds(10, 10, 80, 20);
		add(labelQuestion);
		
		buttonOne = new JButton("Aceptar");
		buttonOne.setBounds(10, 70, 90, 30);
		add(buttonOne);
		buttonOne.addActionListener(this);
		
		buttonTwo = new JButton("Cerrar");
		buttonTwo.setBounds(180, 70, 90, 30);
		add(buttonTwo);
		buttonTwo.addActionListener(this);
	}

	public static void main (String [] args) {
		J29JTextField interfaz = new J29JTextField();
		interfaz.setBounds(0,0, 300, 150);
		interfaz.setVisible(true);
		interfaz.setResizable(true);
		interfaz.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonOne) {
			setTitle(answer.getText());
		} else if(e.getSource() == buttonTwo) {
			System.exit(0);
		}
	}
}

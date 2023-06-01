package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class J30TextArea extends JFrame  {
	private JTextArea largeAnswer;
	private JTextField shortAnswer;
	
	public J30TextArea() {
		setLayout(null);
		
		shortAnswer = new JTextField("Pensando...");
		shortAnswer.setBounds(20, 20, 500, 30);
		add(shortAnswer);
		
		largeAnswer = new JTextArea();
		largeAnswer.setBounds(20, 60, 500, 450);
		add(largeAnswer);
	}
	
	public static void main(String[] args) {
		J30TextArea window = new J30TextArea();
		window.setSize(560, 580);
		window.setTitle("JTextArea");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

package Interfaz;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class J31JScrollPane extends JFrame {
	private JTextField shortAnswer;
	private JTextArea largeAnswer;
	private JScrollPane mover;
	
	public J31JScrollPane() {
		setLayout(null);
		shortAnswer = new JTextField();
		shortAnswer.setBounds(20, 20, 500, 30);
		add(shortAnswer);
		
		largeAnswer = new JTextArea();
		
		mover = new JScrollPane(largeAnswer);
		mover.setBounds(20, 60, 500, 450);
		add(mover);
	}
	
	public static void main(String[] args) {
		J31JScrollPane window = new J31JScrollPane();
		window.setSize(560, 580);
		window.setTitle("ScrollPane");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

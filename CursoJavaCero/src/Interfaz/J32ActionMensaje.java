package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class J32ActionMensaje extends JFrame implements ActionListener {
	private JTextField answer;
	private JButton button;
	private JTextArea body;
	private JScrollPane mover;
	
	public J32ActionMensaje() {
		setLayout(null);
		answer = new JTextField();
		answer.setBounds(20, 20, 380, 30);
		add(answer);
		
		body = new JTextArea();
		
		mover = new JScrollPane(body);
		mover.setBounds(20, 60, 500, 450);
		add(mover);
		
		button = new JButton("Agregar");
		button.setBounds(410, 20, 100, 30);
		add(button);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			body.append(answer.getText() + "\n" );
			answer.setText(null);
		}
	}

	public static void main(String[] args) {
		J32ActionMensaje window = new J32ActionMensaje();
		window.setSize(550, 570);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

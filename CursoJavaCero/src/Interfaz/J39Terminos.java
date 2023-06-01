package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class J39Terminos extends JFrame implements ActionListener, ChangeListener {
	private JLabel question;
	private JCheckBox option;
	private JButton verify;
	
	public J39Terminos() {
		setLayout(null);
		question = new JLabel("Aceptar Terminos y condiciones");
		question.setBounds(10, 10, 200, 20);
		add(question);
		
		option = new JCheckBox("Acepto");
		option.setBounds(10, 40, 80, 20);
		option.addChangeListener(this);
		add(option);
		
		verify = new JButton("Continuar");
		verify.setBounds(10, 70, 90, 30);
		verify.addActionListener(this);
		verify.setEnabled(false);
		add(verify);
	}
	
	public static void main(String[] args) {
		J39Terminos window = new J39Terminos();
		window.setSize(300, 150);
		window.setTitle("Terminos y condiciones");
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if(option.isSelected()) {
			verify.setEnabled(true);
		} else {
			verify.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == verify) {
			System.exit(0);
		}
	}


}

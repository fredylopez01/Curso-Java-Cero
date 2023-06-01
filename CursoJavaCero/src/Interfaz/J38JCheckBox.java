package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J38JCheckBox extends JFrame implements ActionListener {
	private JLabel question;
	private JCheckBox optionOne;
	private JCheckBox optionTwo;
	private JCheckBox optionThree;
	private JLabel result;
	
	public J38JCheckBox() {
		setLayout(null);
		question = new JLabel("Marque que idiomas habla:");
		question.setBounds(10, 10, 300, 20);
		add(question);
		
		optionOne = new JCheckBox("Ingles");
		optionOne.setBounds(10, 30, 300, 20);
		optionOne.addActionListener(this);
		add(optionOne);
		
		optionTwo = new JCheckBox("Español");
		optionTwo.setBounds(10, 50, 300, 20);
		optionTwo.addActionListener(this);
		add(optionTwo);
		
		optionThree = new JCheckBox("Freances");
		optionThree.setBounds(10, 70, 300, 20);
		optionThree.addActionListener(this);
		add(optionThree);
		
		result = new JLabel();
		result.setBounds(10, 90, 300, 20);
		add(result);
	}

	public static void main(String[] args) {
		J38JCheckBox window = new J38JCheckBox();
		window.setSize(400, 300);
		window.setTitle("Marcar opciones");
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		StringBuilder message = new StringBuilder("Uested habla: ");
		if(optionOne.isSelected()) {
			message.append(" ingles");
		} 
		if(optionTwo.isSelected()) {
			message.append(" español");
		} 
		if(optionThree.isSelected()) {
			message.append(" frances");
		}
		result.setText(message.toString());
	}
}

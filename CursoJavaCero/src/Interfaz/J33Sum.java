package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class J33Sum extends JFrame implements ActionListener{
	private JLabel questionOne;
	private JTextField dateOne;
	private JLabel questionTwo;
	private JTextField dateTwo;
	private JButton sum;
	private JLabel result;
	
	public J33Sum() {
		setLayout(null);
		questionOne = new JLabel("Valor 1: ");
		questionOne.setBounds(10, 10, 80, 20);
		add(questionOne);
		
		dateOne = new JTextField();
		dateOne.setBounds(100, 10, 100, 20);
		add(dateOne);
		
		questionTwo = new JLabel("Valor 2: ");
		questionTwo.setBounds(10, 40, 100, 20);
		add(questionTwo);
		
		dateTwo = new JTextField();
		dateTwo.setBounds(100, 40, 100, 20);
		add(dateTwo);
		
		sum = new JButton("Sumar");
		sum.setBounds(10, 70, 80, 20);
		add(sum);
		sum.addActionListener(this);
		
		result = new JLabel("Resultado: ");
		result.setBounds(100, 70, 100, 20);
		add(result);
	}
	
	
	public static void main(String[] args) {
		J33Sum window = new J33Sum();
		window.setSize(230, 140);
		window.setTitle("Sumar");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sum) {
			result.setText("Resultado: " + (Double.parseDouble(dateOne.getText()) + Double.parseDouble(dateTwo.getText()))); 
		}
		
	}

}

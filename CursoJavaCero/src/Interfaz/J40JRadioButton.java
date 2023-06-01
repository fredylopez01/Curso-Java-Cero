package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class J40JRadioButton extends JFrame implements ChangeListener {
	private JRadioButton optionOne;
	private JRadioButton optionTwo;
	private JRadioButton optionThree;
	private ButtonGroup bg;
	
	public J40JRadioButton() {
		setLayout(null);
		bg = new ButtonGroup();
		optionOne = new JRadioButton("400*300");
		optionOne.setBounds(10, 10, 200, 20);
		optionOne.addChangeListener(this);
		add(optionOne);
		bg.add(optionOne);
		
		optionTwo = new JRadioButton("800*600");
		optionTwo.setBounds(10, 40, 200, 20);
		optionTwo.addChangeListener(this);
		add(optionTwo);
		bg.add(optionTwo);
		
		optionThree = new JRadioButton("1200*900");
		optionThree.setBounds(10, 70, 200, 20);
		optionThree.addChangeListener(this);
		add(optionThree);
		bg.add(optionThree);
	}
	
	public static void main(String[] args) {
		J40JRadioButton window = new J40JRadioButton();
		window.setSize(300, 200);
		window.setTitle("RadioButton");
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(optionOne.isSelected()) {
			setSize(400, 300);
			setLocationRelativeTo(null);
		} else if(optionTwo.isSelected()) {
			setSize(800, 600);
			setLocationRelativeTo(null);
		} else if(optionThree.isSelected()) {
			setSize(1200, 900);
			setLocationRelativeTo(null);
		}
		
	}

}

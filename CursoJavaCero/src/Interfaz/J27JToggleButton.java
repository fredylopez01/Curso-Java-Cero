package Interfaz;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class J27JToggleButton extends JFrame {
	private JToggleButton boton;
	private JToggleButton boton2;
	private JToggleButton boton3;
	private ButtonGroup grupoBotones;
	
	public J27JToggleButton() {
		setLayout(null);
		setSize(300, 250);
		setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boton = new JToggleButton("Opción 1", true);
		boton.setBounds(20, 20, 90, 30);
		add(boton);
		
		boton2 = new JToggleButton("Opción 2", true);
		boton2.setBounds(20, 60, 90, 30);
		add(boton2);
		
		boton3 = new JToggleButton("Opción 3", true);
		boton3.setBounds(20, 100, 90, 30);
		add(boton3);
		
		grupoBotones = new ButtonGroup();
		grupoBotones.add(boton);
		grupoBotones.add(boton2);
		grupoBotones.add(boton3);
	}

	public static void main(String[] args) {
		J27JToggleButton window = new J27JToggleButton();

	}

}

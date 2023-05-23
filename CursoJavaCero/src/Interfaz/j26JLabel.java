package Interfaz;

import javax.swing.*;

public class j26JLabel extends JFrame {
	
	private JLabel etiqueta;
	private JLabel etiquetaTwo;
	
	public j26JLabel() {
		/*
		 * Se le dice que se trabaja con coordenadas pero que no se hara nada hasta que no se le diga donde estara
		 */
		setLayout(null);
		
		etiqueta = new JLabel("Interfaz Gráfica.");
		etiqueta.setBounds(10, 20, 300, 30);
		/*
		 * Esta linea funciona para agregar el JLabel a la interfaz
		 */
		add(etiqueta);
		
		etiquetaTwo = new JLabel("Version 1.0");
		etiquetaTwo.setBounds(10, 100, 100, 30);
		add(etiquetaTwo);
	}
	
	public static void main(String[] args) {
		j26JLabel interfaz = new j26JLabel();
		interfaz.setBounds(0, 0, 300, 200);
		interfaz.setResizable(false);
		interfaz.setVisible(true);
		interfaz.setLocationRelativeTo(null);
		
	}

}

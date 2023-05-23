package Interfaz;

/*
 * se importa la libreria swing y el acterisco indica que se deben importar todos sus elementos
 * el acterisco no es una buena practica
 */

import javax.swing.*;

public class j24InterfazLibreriaswing extends JFrame {
	private JLabel label1;
	
	public j24InterfazLibreriaswing() {
	setLayout(null);
	label1 = new JLabel("Fredy Oswaldo López ");
	label1.setBounds(80, 50, 600, 600);
	add(label1);
	}
	
	public static void main (String [] args) {
		j24InterfazLibreriaswing etiqueta = new j24InterfazLibreriaswing();
		etiqueta.setBounds(0,0,400,800);
		etiqueta.setVisible(true);
		etiqueta.setLocationRelativeTo(null);
	}
}

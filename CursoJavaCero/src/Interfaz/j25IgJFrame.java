package Interfaz;

import javax.swing.*;

public class j25IgJFrame extends JFrame{

	public j25IgJFrame() {
		setLayout(null);
	}
	/*
	 * Forma de como hacer una interfaz
	 */
	public static void main(String[] args) {
		j25IgJFrame etiqueta = new j25IgJFrame();
		/*
		 * Las coordenadas dentro de setBounds significan
		 * 1: a cuanto de los lados esta ubicada la interfaz
		 * 2: a cuanto de arriba y abajo esta ubicada la interfaz
		 * 3: ancho de la interfaz
		 * 4: alto de la interfaz
		 */
		etiqueta.setBounds(0,0,750, 550);
		etiqueta.setVisible(true);
		
		/*
		 * la siguiente linea de codigo hace que sin importar donde ubique la interfaz o ventana aparecera en el centro de la pantalla
		 */
		
		etiqueta.setLocationRelativeTo(null);
		
		/*
		 * la siguiente linea de codigo permite que la interfaz o ventana pueda cambiar el tamaño si el ususario lo desea
		 * pero desde esta linea de codigo permitimos o no esta funsion
		 */
		
		etiqueta.setResizable(true);
	}

}

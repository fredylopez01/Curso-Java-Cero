package Excersice;

import java.util.Scanner;
import java.util.ArrayList;

public class Loteria{
	public static void main(String [] args){
		int numero;
		ArrayList numeros = new ArrayList();
		

		// Genera 5 numeros entre 1 y 50
		for (int i = 1; i <= 5; i++) {
			numero = (int) (Math.random() * 50 + 1);
				numeros.add(numero);
			
		}

		System.out.println("La convinacion del Euromillones es:");
		
		System.out.println(numeros);
		
	}
}
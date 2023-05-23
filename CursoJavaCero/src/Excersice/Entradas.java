package Excersice;

import java.util.Scanner;

public class Entradas {
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		String nombre = "";
		int edad = 0, altura = 0, peso = 0;
		
		System.out.println("¿Cuál es tu nombre?");
		nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es:" + nombre);
	}
}
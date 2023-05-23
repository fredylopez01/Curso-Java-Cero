package Excersice;

import java.util.Scanner;

public class Vacaciones {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int clave = 0, antiguedad = 0, dias = 0;
		String nombre = "";
		
		System.out.println ("Este programa determina cuantos días de vacaciones se otorgan a cada trabajador. Para ello responda las siguientes preguntas");
		System.out.println ("Cuál es su nombre");
		nombre = input.nextLine();
		System.out.println ("Ahora segun el menú elija a que departamento de trabajo pertenece");
		System.out.println ("");
		System.out.println ("    Menú");
		System.out.println ("1: Atención al cliente");
		System.out.println ("2: Logística");
		System.out.println ("3: Gerencia");
		clave = input.nextInt();
		System.out.println ("");
		System.out.println("Ahora diganos: ¿Cuantos años lleva trabajando en esta compañia?");
		antiguedad = input.nextInt();
		
		if (clave == 1){
			if (antiguedad >= 1 && antiguedad < 2){
				dias = 6;
			} else if (antiguedad >= 2 && antiguedad < 7) {
				dias = 14;
			} else if (antiguedad >= 7) {
				dias = 20;
			} else {
				System.out.println("Error. Vuelva intentar.");
			}
		} else if (clave == 2) {
			if (antiguedad >= 1 && antiguedad < 2){
				dias = 7;
			} else if (antiguedad >= 2 && antiguedad < 7) {
				dias = 15;
			} else if (antiguedad >= 7) {
				dias = 22;
			} else {
				System.out.println("Error. Vuelva intentar.");
			}
		}else if (clave == 3) {
			if (antiguedad >= 1 && antiguedad < 2){
				dias = 10;
			} else if (antiguedad >= 2 && antiguedad < 7) {
				dias = 20;
			} else if (antiguedad >= 7) {
				dias = 30;
			} else {
				System.out.println("Error. Vuelva intentar.");
			}
		} else {
			System.out.println("Error. Vuelva intentar.");
		}
		System.out.println("Señor(a): " + nombre + " tiene derecho a " + dias + " días de vacaciones");
	}
}
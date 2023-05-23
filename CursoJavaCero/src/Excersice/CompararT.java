package Excersice;

import java.util.Scanner;

public class CompararT {
	public static void main (String [] args){
		String nombre = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cual es el nombre del Presindente de EE.UU");
		nombre = input.nextLine();
		
		if (nombre.equals("Juan")){
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
	}
}
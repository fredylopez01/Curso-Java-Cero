package Excersice;

import java.util.Scanner;

public class Alfabeto {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int letra = 0;
		int valor = 0;
		
		System.out.println("Hola escribe un caracter y tediremos de que tipo es");
		letra = input.nextInt();
		
		
		if (letra == 65){
			System.out.println("Vocal");
		}
	}
}
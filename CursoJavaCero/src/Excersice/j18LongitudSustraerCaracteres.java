package Excersice;

import java.util.Scanner;

public class j18LongitudSustraerCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nombre = "Carlos";
		
		System.out.println("Ingrese una cadena de caracteres para que sea examinada");
		nombre = input.nextLine();
		System.out.println("La cadena de carcateres: " + nombre + " .Tiene: " + nombre.length() + " caracteres");
		
		/*
		 * Sustraer una parte de una cadena
		 */
		
		int begin = 0;
		int end = 0;
		System.out.print("Ingrese desde que caracter quiere obtener la nueva cadena de carácteres: ");
		begin = input.nextInt();
		System.out.print("Ingrese hasta donde quiere obtener la nueva cadena de caracteres: ");
		end = input.nextInt();
		System.out.println("La nueva frase obtenida es: " + nombre.substring(begin, end));
	}

}

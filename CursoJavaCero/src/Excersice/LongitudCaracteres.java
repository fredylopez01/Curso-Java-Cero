package Excersice;

import java.util.Scanner;

public class LongitudCaracteres {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		String cadenaOriginal = "", cadenaSubstraccion = "";
		int numCarac = 0, desde = 0, hasta = 0;
		
		System.out.print("Introduce una cadena de caracteres: ");
		cadenaOriginal = input.nextLine();
		
		numCarac = cadenaOriginal.length();
		
		System.out.println("La cadena de caracteres " + cadenaOriginal + " posee " + numCarac + " caracteres");
		
		System.out.print("¿Desde que caracteres deseas obtener la nueva cadena: ");
		desde = input.nextInt();
		System.out.print("¿Hasta que caracteres deseas obtener la nueva cadena: ");
		hasta = input.nextInt();
		
		cadenaSubstraccion = cadenaOriginal.substring(desde,hasta);
		System.out.println("La nueva cadena es: " + cadenaSubstraccion);
	}
}
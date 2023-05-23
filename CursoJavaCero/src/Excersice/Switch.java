package Excersice;

import java.util.Scanner;

public class Switch {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int numberOne = 0, numberTwo = 0, result = 0;
		int opcion = 0;
		String operacion = "";
		
		System.out.println("*****************************************************************");
		System.out.println("****************************CALCULADORA**************************");
		System.out.println("*****************************************************************");
		System.out.println("");
		System.out.println("Por favor introduzaca el primer numero para realizar su operación");
		numberOne = input.nextInt();
		System.out.println("Por favor introduzaca el segundo numero para realizar su operación");
		numberTwo = input.nextInt();
		System.out.println("");
		System.out.println("Ahora ingrese que operación desea realiazar según el menú");
		System.out.println("");
		System.out.println("    Menú");
		System.out.println("Sumar       1");
		System.out.println("Resta       2");
		System.out.println("Multiplicar 3");
		System.out.println("Dividir     4");
		opcion = input.nextInt();
		
		switch (opcion){
			case 1: result = numberOne + numberTwo;
			operacion = "suma";
			break;
			case 2: result = numberOne - numberTwo;
			operacion = "resta";
			break;
			case 3: result = numberOne * numberTwo;
			operacion = "multiplicación";
			break;
			case 4: result = numberOne / numberTwo;
			operacion = "división";
			break;
			default: System.out.println("Error. Opción incorerecta no valida. Vuelva a intentar.");
		}
		System.out.println("El resultado de tu " + operacion + " es: " + result);
	}
}
package Excersice;

import java.util.Scanner;

public class CalculadorE {
	public static void main(String [] args){
		
		Scanner in = new Scanner (System.in);
		int operation = 0, numberOne = 0, numberTwo = 0, result = 0;
		
		System.out.println("Esta es una claculadora.");
		System.out.println("");
		System.out.println("    Menú");
		System.out.println("Sumar       1");
		System.out.println("Resta       2");
		System.out.println("Multiplicar 3");
		System.out.println("Dividir     4");
		System.out.println("");
		System.out.println("Por favor ingrese que operación desea realizar según el menu");
		operation = in.nextInt();
		System.out.println("Por favor ingrese el valor del primer numero");
		numberOne = in.nextInt();
		System.out.println("Por favor ingrese el valor del segundo numero");
		numberTwo = in.nextInt();
		
		if (operation == 1){
			result = numberOne + numberTwo;
			System.out.println ("El resultado de tu suma es:" + result);
		} else if (operation == 2){
			result = numberOne - numberTwo;
			System.out.println ("El resultado de tu resta es:" + result);
		} else if (operation == 3){
			result = numberOne * numberTwo;
			System.out.println ("El resultado de tu multiplicación es:" + result);
		} else if (operation == 4){
			result = numberOne / numberTwo;
			System.out.println ("El resultado de tu división es:" + result);
		} else {
			System.out.println("Error. Opción incorrecta.Vuelva a intentarlo");
		}
	}
}
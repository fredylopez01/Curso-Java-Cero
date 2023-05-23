package Excersice;

import java.util.Scanner;

public class VectoresDinamicosArreU{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int n = 0, numero = 0;
		
		System.out.println("Ingrese la cantidad de números que ingresara");
		n = input.nextInt();
		
		int numeros[] = new int[n];
		
		for (int i = 0; i < n; i++){
			System.out.println("Ingrese el numero para la casilla " + (i + 1));
			numero = input.nextInt();
			numeros[i] = numero;
		}
		for (int i = 0; i < n; i++){
			System.out.print(numeros[i] + ", ");
		}
	}
}
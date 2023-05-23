package Excersice;

import java.util.Scanner;

public class Hola {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
		int filas = 0, columnas = 0, numero = 1;
		
		System.out.println("Ingrese la cantidad de filas que desea que tenga la tabla");
		filas = input.nextInt();
		
		System.out.println("Ingrese la cantidad de columnas que desea que tenga la tabla");
		columnas = input.nextInt();
		
		int tabla[][] = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++){
			for (int j = 0; j < columnas; j++){
				tabla[i][j] = numero;
				numero++;
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println("");
		}
		
    }
}

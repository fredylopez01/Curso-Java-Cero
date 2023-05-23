package Excersice;

import java.util.Scanner;

public class vectoresBidimencionales{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		String nombre, categoria;
		int numeroI, horas, nca = 0, ncb = 0, ncc = 0, sueldo = 0;
		
		int estadistica [][] = new int [1][5]; 
		String estadisticad [][] = new String [1][5]; 
		
		System.out.println("Hola. Este es la plataforma de docentes. Intoduzca los datos para cada docente");
		
		System.out.println("Nombre");
		nombre = input.nextLine();
		estadisticad[0][0] = nombre;
		
		System.out.println("Número de documento de identidad");
		numeroI = input.nextInt();
		estadistica[0][1] = numeroI;
		
		System.out.println("Horas laboradas en el mes");
		horas = input.nextInt();
		estadistica[0][2] = horas;
		
		System.out.println("Categoria");
		categoria = input.next();
		estadisticad[0][3] = categoria;
		
		if (categoria.equalsIgnoreCase("a")){
			sueldo = horas * 25000;
			nca = nca + 1;
		} else if (categoria.equalsIgnoreCase("b")){
			sueldo = horas * 35000;
			ncb = ncb + 1;
		} else if (categoria.equalsIgnoreCase("c")){
			sueldo = horas * 50000;
			ncc = ncc + 1;
		} else {
			System.out.println("Error. Opción no valida");
		}
		estadistica[0][4] = sueldo;
		
		System.out.print(nombre + " ");
		System.out.print(numeroI + " ");
		System.out.print(horas + " ");
		System.out.print(categoria + " ");
		System.out.println(sueldo + " ");
		
		System.out.print(estadisticad[0][0] + " ");
		System.out.print(estadistica[0][1] + " ");
		System.out.print(estadistica[0][2] + " ");
		System.out.print(estadisticad[0][3] + " ");
		System.out.print(estadistica[0][4] + " ");
	}
}
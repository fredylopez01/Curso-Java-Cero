package Excersice;

import java.util.Scanner;

public class Profesores {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int n = 10;
		int inicio = 0;
		
		String nombres[] = new String[n];
		int numberI[] = new int[n];
		String categoria[] = new String[n];
		int horas[] = new int[n];
		int sueldos[] = new int[n];
		int horass = 0, numberId = 0, sueldo = 0, tSueldos = 0;
		String nombre = "", categorias = "", mTrabajadores = "Si";
			
		while (mTrabajadores.equalsIgnoreCase("Si")){
			
			System.out.print("Por favor ingrese el nombre del trabajador: ");
			nombre = input.nextLine();
			nombres[inicio] = nombre;
			System.out.print("Por favor ingrese el numero de identidad del trabajador: ");
			numberId = input.nextInt();
			numberI[inicio] = numberId;
			System.out.print("Por favor ingrese las horas laboradas al mes por el trabajador: ");
			horass = input.nextInt();
			horas[inicio] = horass;
			System.out.print("Por favor ingrese la categoria a la que pertenece el trabajador: ");
			categorias = input.next();
			categoria[inicio] = categorias;
			
			if (categorias.equalsIgnoreCase("a")){
				sueldo = horass*25000;
				sueldos[inicio] = sueldo;
			} else if (categorias.equalsIgnoreCase("b")){
				sueldo = horass*35000;
				sueldos[inicio] = sueldo;
			} else if (categorias.equalsIgnoreCase("c")){
				sueldo = horass*50000;
				sueldos[inicio] = sueldo;
			} else {
				System.out.println("Error. Opcion no validad");
			}
			
			tSueldos = tSueldos + sueldo;
			System.out.print("¿Hay mas trabajadores?");
			mTrabajadores = input.next();
			n = n + 1;
			inicio = inicio + 1;
		} 
		
		while (n > inicio){
			System.out.print(nombres[inicio] + " ");
			System.out.print(numberI[inicio] + " ");
			System.out.print(categoria[inicio] + " ");
			System.out.print(horas[inicio] + " ");
			System.out.print(sueldos[inicio] + " ");
			inicio = inicio + 1;
		}
	}
}
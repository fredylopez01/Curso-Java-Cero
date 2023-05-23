package Excersice;

import java.util.Scanner;

public class j21MatricesArreglosBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name[] = new String[3];
		double salaries[][] = new double[3][3];
		
		for(int i = 0; i<name.length; i++) {
			System.out.println("Ingrese el nombre del trabajador #" + (i+1));
			name[i] = input.next();
			System.out.println("Ingrese el salario del primer mes: ");
			salaries[0][i] = input.nextDouble();
			System.out.println("Ingrese el salario del segundo mes: ");
			salaries[1][i] = input.nextDouble();
			System.out.println("Ingrese el salario del tecer mes: ");
			salaries[2][i] = input.nextDouble();
		}
		
		for(int j = 0; j<name.length; j++) {
			System.out.print("--" + name[j]);
		}
		
		System.out.println("");
		
		/*
		 * j= filas
		 * i = columnas
		 */
		
		for(int j = 0; j<name.length; j++) {
			System.out.println("");
			for(int i = 0; i<3; i++)
			System.out.print("--" + salaries[j][i]);
		}
		
		
		/*
		 * Matices con tamaño dado por el usuario
		 */
		
		int filas = 0, columnas = 0;
		
		System.out.println("Ingrese cuantas filas desea que tenga la matriz");
		filas = input.nextInt();
		System.out.println("Ingrese cuantas columnas desea que tenga la matriz");
		columnas = input.nextInt();
		
		String nameTwo[] = new String[columnas];
		double salariesTwo[][] = new double[filas][columnas];
		
		for(int j = 0; j<columnas; j++) {
			System.out.println("Ingrese el nombre del trabajador #" + (j+1));
			nameTwo[j] = input.next();
			for(int i = 0; i<filas; i++) {
				System.out.println("Ingrese el salario del mes: #" + (i+1));
				salariesTwo[j][i] = input.nextDouble();
				}
		}
		
		for(int j = 0; j<columnas; j++) {
			System.out.print("--" + nameTwo[j]);
		}
		
		System.out.println("");
		
		for(int j = 0; j<filas; j++) {
			for(int i = 0; i<columnas; i++) {
			System.out.print("--" + salariesTwo[j][i]);
			}
			System.out.println("");
		}
		
		/*
		 * Matiz con auto llenado
		 */
		
		int filasThree = 0, columnasThree = 0, contador = 1;
		
		System.out.println("Ingrese cuantas filas desea que tenga la matriz");
		filasThree = input.nextInt();
		System.out.println("Ingrese cuantas columnas desea que tenga la matriz");
		columnasThree = input.nextInt();
		
		
		int salariesThree[][] = new int[filasThree][columnasThree];
		
		for(int j = 0; j<filasThree; j++) {
			for(int i = 0; i<columnasThree; i++) {
			salariesThree[j][i] = contador;
			System.out.print("[" + salariesThree[j][i] + "]");
			contador++;
			}
			System.out.println("");
		}
	}

}

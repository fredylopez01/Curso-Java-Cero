package Excersice;

import java.util.Scanner;

public class Vendedores {
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		int vVentas = 0, vendedor = 0, comision = 0, vVentasT = 0; 
		String nombre = "";
		
		System.out.println("Por favor ingrese el valor de ventas realizadas en toda la empresa");
		vVentas = input.nextInt();
		
		while (vVentas > 0){
		
			System.out.println("Por favor ingrese el nombre del trabajador");
			nombre = input.next();
			System.out.println("Por favor ingrese el tipo de vendedor que es " + nombre + " : 1 para vendedor puerta a puerta y 2 para ejecutivo de ventas");
			vendedor = input.nextInt();
			if (vendedor == 1){
				System.out.println("Por favor ingrese el valor de ventas realizadas por el trabajador: " + nombre);
				vVentasT = input.nextInt();
				comision = (vVentasT*20)/100;
				System.out.println("El valor de comisión para el trabajor" + nombre + " es de: " + comision);
			} else if (vendedor == 2){
				System.out.println("Por favor ingrese el valor de ventas realizadas por el trabajador: " + nombre);
				vVentasT = input.nextInt();
				comision =(vVentasT*30)/100;
				System.out.println("El valor de comisión para el trabajor" + nombre + " es de: " + comision);
			}else {
				System.out.println("Error. Opción no valida");
			}
		vVentas = vVentas - vVentasT;
		}
		if (vVentas < 0){
			//vVentas
		}
	}
}
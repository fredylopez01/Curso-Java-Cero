package Excersice;

import java.util.Scanner;

public class Cajero {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int efectivo = 0, valorC = 0, valorP = 0, nProductos = 0, descuento = 0;
		
		System.out.println("Por favor ingrese cual es el efectivo disponible por su cliente");
		efectivo = input.nextInt();
		while (efectivo >= valorC){
			System.out.println("Ingrese el valor del producto");
			valorP = input.nextInt();
			valorC = valorC + valorP;
			nProductos += 1;
		}
		if (nProductos == 10 && valorC > 100000){
			descuento = (valorC*10)/100;
			valorC = valorC - descuento;
		}
		if (valorC > efectivo){
			valorC = valorC - valorP;
		}
		System.out.println("El valor de su compra es de: " + valorC + " con un descuento de: " + descuento);
	}
}
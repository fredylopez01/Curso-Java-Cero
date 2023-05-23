package Excersice;

import java.util.Scanner;

public class CajeroAutomatico {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int efectivo = 0, ValorC = 0, valorP = 0, nProductos = 0, descuento = 0;
		
		System.out.println("Por favor ingrese cual es el efectivo disponible por su cliente");
		efectivo = input.nextInt();
		while (efectivo >= ValorC){
			System.out.println("Ingrese el valor del producto");
			valorP = input.nextInt();
			ValorC = ValorC + valorP;
			efectivo = efectivo - ValorC;
			nProductos += 1;
			if (nProductos == 10 && ValorC > 100000){
				descuento = (ValorC*10)/100;
				ValorC = ValorC - descuento;
			}
		}
		System.out.println("El valor de su compra es de: " + ValorC + "con un descuento de: " + descuento);
	}
}
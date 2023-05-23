package Excersice;

import java.util.Scanner;

public class Services2 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int numberI = 0, estrato= 0, tarifa = 0, estado = 0;
		
		
		System.out.println ("Este es un programa del acueducto Magallanes.");
		System.out.println ("Este programa le dira cuanto es el valor de su tarifa por consumo.");
		System.out.println ("Por favor ingrese la información solicitada.");
		
		System.out.println ("Ingrese numero de indentificacion.");
		numberI = in.nextInt();
		System.out.println ("Ahora ingrese su estado: 1 para Activo, 2 para Suspendido.");
		estado = in.nextInt();
		
		if (estado == 1) {
			System.out.println("¿Qué estrato es?");
			estrato = in.nextInt();
			if (estrato == 1){
				tarifa = 10000;
			} else if (estrato == 2){
				tarifa = 15000;
			} else if (estrato == 3){
				tarifa = 30000;
			} else if (estrato == 4){
				tarifa = 50000;
			} else if (estrato == 3){
				tarifa = 65000;
			} else {
				System.out.println("Estrato. Error. Opción no valida, no coincide con los criterios. Vuelva a intentar.");
			}
		}else if (estado == 2){
			tarifa = 0;
		}else {
			System.out.println("Estado. Error. Opción no valida, no coincide con los criterios. Vuelva a intentar.");
		}
		System.out.println("El valor a pagar del usuario " + numberI + " de estrato "+ estrato +" y por consiguiente tarifa básica es de: $" + tarifa);
		
	}
}
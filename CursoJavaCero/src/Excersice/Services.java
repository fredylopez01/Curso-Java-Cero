package Excersice;

import java.util.Scanner;

public class Services {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		int numberI = 0, estrato= 0, tarifa = 0;
		char estado;
		
		System.out.println ("Este es un programa del acueducto Magallanes.");
		System.out.println ("Este programa le dira cuanto es el valor de su tarifa por consumo.");
		System.out.println ("Por favor ingrese la información solicitada.");
		
		System.out.println ("Ahora ingrese su estado: A para Activo, S para suspendido. Recuerde que debe ingresar la letra entre comillas y en mayuscula");
		estado = input.next().charAt(0);
		
		if (estado == 'A') {
			System.out.println("¿Qué estrato es?");
			estrato = input.nextInt();
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
		}else if (estado == 'S'){
			tarifa = 0;
		}else {
			System.out.println("Estado. Error. Opción no valida, no coincide con los criterios. Vuelva a intentar.");
		}
		System.out.println("El valor a pagar de acuerdo a su tarifa básica es de: $" + tarifa);
	}
}
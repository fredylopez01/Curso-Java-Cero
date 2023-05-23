package Excersice;

import java.util.Scanner;

public class BarcoA{
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		int ndisparos = 0, muertes = 0, disparo = 0, disparou = 0, disparod = 0, disparot = 0;
		int posicion = (int)(Math.random()*9+1);
		
		System.out.println("**********************************************************************************************************");
		System.out.println("*************************************BATALLA NAVAL********************************************************");
		System.out.println("**********************************************************************************************************");
		System.out.println("");
		System.out.println("Bienvenido a batalla naval intente destruir el barco que ocupa tres lugares de los diez que puede disparar");
		System.out.println("");
		System.out.println("**Tu turno dispara. Escribe en numeros cual casilla quieres disparar, recuerda que solo hay 10 casillas***");
		
		while (muertes <= 2){
			System.out.println("Dispara");
			disparo = input.nextInt();
			if (disparo >= 1 && disparo <= 10){
				if (disparo == posicion){
					if (disparou == 0){
						System.out.println("ACIERTO");
						ndisparos = ndisparos + 1;
						disparou = disparou + 1;
						muertes = muertes + 1;
					} else {
						System.out.println("ACIERTO");
						ndisparos = ndisparos + 1;
						disparou = disparou + 1;
					}
				} else if (disparo == posicion + 1){
					if (disparod == 0){
						System.out.println("ACIERTO");
						ndisparos = ndisparos + 1;
						disparod = disparod + 1;
						muertes = muertes + 1;
					} else {
						System.out.println("ACIERTO");
						ndisparos = ndisparos + 1;
						disparod = disparod + 1;
					}
				} else if (disparo == posicion - 1){
					if (disparot == 0){
						System.out.println("ACIERTO");
						ndisparos = ndisparos + 1;
						disparot = disparot + 1;
						muertes = muertes + 1;
					} else {
						System.out.println("ACIERTO");
						ndisparos = ndisparos + 1;
						disparot = disparot + 1;
					}
				} else {
					System.out.println("AGUA");
					ndisparos = ndisparos + 1;
				}
			} else {
				System.out.println("Error. Intenta de de nuevo. Opción no valida");
			}
		}
		System.out.println("");
			System.out.println("**************************************HUNDIDO********************************************************");
			System.out.println("Has ganado");
			System.out.println("Numeros de disparos realizados:--------------------------------------------------------------------" + ndisparos);
	}
}
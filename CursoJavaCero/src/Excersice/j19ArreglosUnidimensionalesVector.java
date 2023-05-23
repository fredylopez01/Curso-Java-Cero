package Excersice;

import java.util.Scanner;

public class j19ArreglosUnidimensionalesVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] number = new int[5];
		String[] name = new String[5];
		
		for(int i = 0; i<5; i++) {
			number[i] = (i+1);
			System.out.println("Ingrese el nombre del participante #" + (i+1));
			name[i] = input.nextLine();
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println(number[i] + "--" + name[i]);
		}
		
		/*
		 * Para hacer un vector o arreglo donde se le pide al usuario la longitud o tamaño y se quiere hacer algo similar a lo anterior
		 * se hace de la siguiente manera
		 */
		
		int size = 0;
		System.out.print("Ingrese cuantas personas tiene la lista que desea crear: ");
		size = input.nextInt();
		
		String[] nameTwo = new String[size];
		
		for(int i = 0; i<nameTwo.length; i++) {
			System.out.println("Ingrese el nombre del participante #" + (i+1));
			nameTwo[i] = input.next();
		}
		
		for(int i = 0; i<nameTwo.length; i++) {
			System.out.println((i+1) + "--" + nameTwo[i]);
		}
		
	}

}

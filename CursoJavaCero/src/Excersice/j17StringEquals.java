package Excersice;

import java.util.Scanner;

public class j17StringEquals {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String nombre = "";
		
		System.out.println("¿Como se llama la cantante de regueton que obtiene el seudonimo de Bichota?");
		nombre = input.nextLine();
		
		if (nombre.equals("Karol G")) {
			System.out.println("Correcto.");
		} else {
			System.out.println("Incorrecto! Siga intentando");
		}
		
		/*
		 *Simulación de inicio de sesion
		 */
		String password = "";
		String user = "";
		System.out.println("");
		System.out.println("*****Inicio de Sesión*****");
		System.out.print("Usuario: ");
		user = input.nextLine();
		System.out.print("Contraseña: ");
		password = input.nextLine();
		
		if (user.equals("Fredy") && password.equals("123")) {
			System.out.println("Inicio de sesión correcto");
		} else {
			System.out.println("Nombre de usuario o contraseña incorrectos");
		}
	}

}

package cajero;

import java.util.Scanner;

public class Cajero {
	private double saldo;
	Scanner input;
	
	public Cajero(double saldo) {
		input = new Scanner(System.in);
		this.saldo = saldo;
	}
	
	public static void main(String[] args) {
		Cajero cajeroTest = new Cajero(500);
		cajeroTest.run();
	}
	
	public void run() {
		int option = 0;
		do {
			System.out.println("Por favor seleccione la opción: \n  1. Consulta saldo \n  2. Retiro de efectivo \n  3. Deposito de "
					+ "efectivo \n  4. Salir");
			option = input.nextInt();
			switch(option) {
				case 1:
					consultRemmant();
					break;
				case 2:
					withdraw();
					break;
				case 3:
					consign();
					break;
				case 4:
					System.out.println("-----------------------------\n¡Gracias! Vuelva pronto\n-----------------------------");
					System.exit(0);
					break;
				default:
					System.out.println("-----------------------------\nOpción no disponible. Vuelva a intentar\n-----------------------------");
					break;
			}
		} while(option != 4);
	}
	
	public void consultRemmant() {
		System.out.println("-----------------------------\nTu saldo actual es:" +  saldo + "\n-----------------------------");
	}
	
	public void withdraw() {
		System.out.println("Cuanto desea retirar: ");
		double amount = input.nextDouble();
		if(amount <= saldo) {
			saldo -= amount;
			System.out.println("-----------------------------\nRetiraste: " + amount + "\nTu saldo actual es:" +  saldo + "\n-----------------------------");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void consign() {
		System.out.println("Cuanto desea depositar: ");
		double amount = input.nextDouble();
		saldo += amount;
		System.out.println("-----------------------------\nConsignaste: " + amount + "\nTu saldo actual es:" +  saldo + "\n-----------------------------");
		
	}
}

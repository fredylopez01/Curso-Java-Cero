package Excersice;

public class CondicionalesAnidadas {
	public static void main(String [] args) {
		int numberOne = 4;
		int numberTwo = 5;
		int result = 0;
		int operation = 5;
		
		System.out.println ("Hola esta es una calculadora.");
		System.out.println ("1 para sumar");
		System.out.println ("2 para restar");
		System.out.println ("3 para división");
		System.out.println ("4 para multiplicación");
		
		if (operation == 1){
			result = numberOne+numberTwo;
			System.out.println ("El resultado de tu suma es: " + result);
		} else if (operation == 2){
			result = numberOne-numberTwo;
			System.out.println ("El resultado de tu resta es: " + result);
		} else if (operation == 3){
			result = numberOne/numberTwo;
			System.out.println ("El resultado de tu division es: " + result);
		} else if (operation == 4){
			result = numberOne*numberTwo;
			System.out.println ("El resultado de resta es: " + result);
		} else{
			System.out.println ("Opción incorrecta. Vuelve a inttentarlo");
		} 
	}
}
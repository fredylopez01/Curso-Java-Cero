package Excersice;

public class For {
	public static void main (String [] args){
		int inicio = 1, fin = 10;
		
		for (inicio = 1; inicio <=10; inicio++){
			System.out.print(inicio + ",");
		}
		System.out.println("");
		for (inicio = 10; inicio >=1; inicio--){
			System.out.print(inicio + ",");
		}
		System.out.println("");
		for (inicio = 1; inicio <=500; inicio+=3){
			System.out.print(inicio + ",");
		}
	}
}
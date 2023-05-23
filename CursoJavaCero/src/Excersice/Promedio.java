package Excersice;

public class Promedio {
	public static void main (String [] args) {
		
		int calculo =5;
		int algoritmos = 8;
		int catedra = 10;
		
		int promedio = (calculo + algoritmos + catedra)/3;
		
		if (promedio >= 6) {
			System.out.println("El estudiante ha aprobado con un promedio de: "  + promedio);
		} else {
			System.out.println("El estudiante ha reprobado con una note de: "+ promedio);
		}
	}
}
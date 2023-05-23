package Excersice;

public class Sucesiones {
	public static void main (String [] args){
		int two = 1, td = 99, total = 100;
		int uno = 0, dos = 1;
		
		for(int un = 1; un <= 10; un++){
			if (un < 10){
			System.out.print(un +  ", ");
			} else {
				System.out.print(un);
			}
		}
		
		System.out.println("");
		System.out.println("Sucesion 2");
		System.out.println("");
		while(two <= 100 && td > 1){
			if (td > 2) {
				System.out.print(two + ", ");
				two = two + 1;
				System.out.print(td + ", ");
				td = td -1;
				total = two + td;
			} else {
				System.out.print(two + ", ");
				two = two + 1;
				System.out.print(td);
				td = td -1;
				total = two + td;
			}
		}
		
		System.out.println("");
		System.out.println("Sucesion 3");
		System.out.println("");
		
		do {
			System.out.print(uno + ", ");
			System.out.print(dos + ", ");
			uno = uno + dos; 
			dos = uno + dos;
			
		} while (dos < 40);
		
	}
}
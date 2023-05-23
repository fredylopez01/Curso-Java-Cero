package Excersice;


import java.util.Scanner;
public class vendedoresf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cedula = 0;
        int tvendedor = 0;
        int vventas = 0;
        int vcomisiones = 0;
        
        System.out.println("Por favor ingrese el numero de cedula del trabajador");
        cedula = input.nextInt();
        System.out.println("¿Que tipo de vendedor es el trabajador. Recuerde 1: Puerta a Puerta 2: "
                + "Ejecutivo de ventas ");
        tvendedor = input.nextInt();
        System.out.println("Ingrese el valor de ve ntas realizado por el vendedor");
        vventas = input.nextInt();
        switch(tvendedor){
            case 1 -> vcomisiones = (int)(vventas*0.2);
            case 2 -> vcomisiones = (int)(vventas*0.3);
            default -> System.out.println("Error. Opción incorerecta no valida. Vuelva a intentar.");
        }
        System.out.println("El vendedor identificado con el numero de cédula: " 
                + cedula + " obtuvo un valor de comisiones de " + vcomisiones);
    }
    
}

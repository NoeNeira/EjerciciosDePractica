package paquete;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Por favor ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("Bienvenido " + nombre);
        if (edad >= 18){
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("Usted no es mayor de edad");
        }
    }

}

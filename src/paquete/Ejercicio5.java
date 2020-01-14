package paquete;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro número:");
        int num2 = scanner.nextInt();

        double promedio = (num1 + num2) / (double) 2;
        System.out.println("El promedio es: " + promedio);
    }
}

package ejerciciosZac;

import java.util.Scanner;

/*
Escribir un programa que te pregunte por dos numeros, y a continuacion imprima un mensaje
del estilo \El promedio es: " y el valor del promedio de ambos numeros.
 */

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

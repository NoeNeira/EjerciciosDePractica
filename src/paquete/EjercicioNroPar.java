package paquete;

import java.util.Scanner;

public class EjercicioNroPar{
    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println(numero + " es un número par");
        }else{
            System.out.println(numero + " es un múmero impar");
        }


    }
}

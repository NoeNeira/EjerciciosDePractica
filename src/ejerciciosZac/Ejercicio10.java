package ejerciciosZac;

/*
a) Escribir un programa que te pregunte por un numero e imprima un mensaje de tipo \[x] es
par" si el numero es par (reemplazando [x] por el numero en cuestion). En caso contrario, debe
imprimir \[x] es impar".
b) Crear un metodo static boolean esPar(int n) que devuelve true si n es par, y false en caso
contrario.
c) Modicar el main del programa para que utilice este metodo.
 */

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un número para conocer si es par o impar.");
        int n = scanner.nextInt();

        if (esPar(n))
            System.out.println(n+" es par.");
        else
            System.out.println(n+" es impar.");
    }

    static boolean esPar(int n){
        if(n % 2 == 0) return true;
        else return false;
    }
}

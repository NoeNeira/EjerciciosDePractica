package ejerciciosZac;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumatoriaPares(n));
    }

    static int sumatoriaPares(int n){
        int acumulador = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                acumulador += i; // acumulador = acumulador + i;
            }
        }
        return acumulador;
    }
}

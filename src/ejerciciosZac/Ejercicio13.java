package ejerciciosZac;

/*
Escribir un metodo static int sumatoria(int n) que devuelve la sumatoria de los numeros
desde 1 hasta n.
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumatoria(n));
    }

    static int sumatoria(int n){
        int acumulador = 0;
        for (int i = 0; i <= n; i++) {
            acumulador += i; // acumulador = acumulador + i;
        }
        return acumulador;
    }
}

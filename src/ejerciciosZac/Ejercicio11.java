package ejerciciosZac;

/*
Escribir un metodo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
Probarlo adecuadamente llamandola desde el main.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        int n = 1234567890;
        System.out.println("La cantidad de cifras del número dado es: " + cantCifras(n));
    }

    static int cantCifras(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
}

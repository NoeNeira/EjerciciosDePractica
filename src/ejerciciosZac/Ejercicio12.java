package ejerciciosZac;

/*
Escribir un metodo static boolean esDivisible(int n, int m) que devuelve true si n es divisible
por m y false en caso contrario. Probarlo adecuadamente llamandola desde el main.
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        int n = 20;
        int m = 5;
        if (esDivisible(n,m))
            System.out.println("El nro. sí es divisible.");
        else
            System.out.println("el nro. no es divisible");
    }

    static boolean esDivisible(int n, int m) {
        if (n % m == 0) return true;
        else return false;
    }
}

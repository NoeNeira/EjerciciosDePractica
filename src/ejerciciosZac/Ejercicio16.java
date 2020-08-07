package ejerciciosZac;
/*
Escribir un metodo static double factorial(int n) que toma un entero positivo n y calcula
n! (el factorial de n) que se dene como el producto de todos los naturales desde 1 hasta n. Por
ejemplo 5! = 5 * 4 * 3 * 2 * 1 = 120. Ojo: por definición, el factorial de 0, es 1 (0! = 1).
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    //Factorial Using a for Loop
    static double factorial(int numero){
        long fact = numero;
        for (int i = 1; i < numero; i++) {
            fact = fact * i;
        }
        return fact;
    }
    //Factorial Using Recursion
    /*static double factorial(int n){
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }*/
}

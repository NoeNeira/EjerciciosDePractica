package ejerciciosZac;
/*
Escribir un metodo static double potencia(double x, int a) que toma un numero racional
x y un entero a y calcula xa.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println(potencia(4,3));
    }

    static double potencia (double x, int a){
        int pow = (int)Math.pow(x,a);
        return pow;
    }
}

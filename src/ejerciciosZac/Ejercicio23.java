package ejerciciosZac;

/*
Ejercicio 23 F
Escribir un metodo static boolean esSinRepetidos(String s) que dada una cadena, devuelve
true si no hay letras repetidas en la cadena. En caso contrario, devuelve false. No utilizar el metodo
del ejercicio 24.
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println(esSinRepetidos("zacarias"));
        System.out.println(esSinRepetidos("zacky"));
    }

    static boolean esSinRepetidos(String palabra) {
        boolean sinRepetidos = true;
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < palabra.length(); j++) {
                if (i != j && palabra.charAt(i) == palabra.charAt(j)) {
                    sinRepetidos = false;
                }
            }
        }
        return sinRepetidos;
    }
}
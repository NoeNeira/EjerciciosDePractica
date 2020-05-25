package ejerciciosZac;

/*
Ejercicio 22
Escribir el metodo static boolean esCapicua(String s) que dada una cadena, devuelve true
si la cadena es igual de atras hacia adelante o de adelante hacia atras. En caso contrario, devuelve
false.
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println(esCapicua("casa"));

    }

    static boolean esCapicua(String palabra) {
        boolean esPalindroma = true;
        for (int i = 0; i < palabra.length(); i++) {
            int ultimaPosicion = palabra.length() - 1 - i;
            if(palabra.charAt(i) != palabra.charAt(ultimaPosicion)){
                esPalindroma = false;
            }
        }
        return esPalindroma;
    }

}
